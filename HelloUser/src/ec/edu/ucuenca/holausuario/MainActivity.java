package ec.edu.ucuenca.holausuario;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button btn = (Button) findViewById(R.id.button1);
		final EditText txtNombre = (EditText) findViewById(R.id.userName);
		
		btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v){
				Intent intent = new Intent(MainActivity.this, ResultActivity.class);
				
				Bundle bundle = new Bundle();
				bundle.putString("Nombre", txtNombre.getText().toString());
				intent.putExtras(bundle);
				
				startActivity(intent);
			}
		});		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
