package ec.edu.ucuenca.holausuario;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	/*
	 * In order for the next activity to query the extra data, you should define
	 * the key for your intent's extra using a public constant.
	 * 
	 * It's generally a good practice to define keys for intent extras using your
	 * app's package name as a prefix. This ensures they are unique, in case your
	 * app interacts with other apps.
	 */
	public final static String EXTRA_MESSAGE = "ec.edu.holausuario.MESSAGE";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/*
		final Button btn = (Button) findViewById(R.id.button1);
		final EditText txtNombre = (EditText) findViewById(R.id.userName);
		
		btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v){
				Intent intent = new Intent(MainActivity.this, ResultActivity.class);
				/*
				 * An intent not only allows you to start another activity,
				 * but it can carry a bundle of data to the activity as well
				 *
				Bundle bundle = new Bundle();
				bundle.putString("Nombre", txtNombre.getText().toString());
				intent.putExtras(bundle);
				
				startActivity(intent);
			}
		});
		*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/**
	 * @param view
	 * Be public
     * Have a void return value
     * Have a View as the only parameter (this will be the View that was clicked)
	 */
	public void sendMessage(View view){
		/* http://developer.android.com/training/basics/firstapp/starting-activity.html#BuildIntent
		 * An Intent is an object that provides runtime binding between separate
		 * components (such as two activities). The Intent represents an app’s
		 * "intent to do something." You can use intents for a wide variety of
		 * tasks, but most often they’re used to start another activity.
		 */
		/*
		 * The constructor used here takes two parameters:
		 * A Context as its first parameter (this is used because the Activity class
		 * is a subclass of Context)
		 * The Class of the app component to which the system should deliver the
		 * Intent (in this case, the activity that should be started) 
		 */
		Intent intent = new Intent(MainActivity.this, ResultActivity.class);
		EditText txtNombre = (EditText) findViewById(R.id.userName);
		String message = txtNombre.getText().toString();
		/*
		 * An Intent can carry a collection of various data types as key-value pairs
		 * called extras. The putExtra() method takes the key name in the first
		 * parameter and the value in the second parameter
		 */
		intent.putExtra(EXTRA_MESSAGE, message);
		/*
		 * To start an activity, call startActivity() and pass it your Intent.
		 * The system receives this call and starts an instance of the Activity
		 * specified by the Intent.
		 */
		this.startActivity(intent);
	}

}
