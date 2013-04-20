/**
 * 
 */
package ec.edu.ucuenca.holausuario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Angel Oswaldo Vázquez Patiño
 *
 */
public class ResultActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.lyt_result);
		
		//final TextView txtMensaje = (TextView) findViewById(R.id.txtResult);		
		//Bundle bundle = getIntent().getExtras();
		//txtMensaje.setText("Hola " + bundle.getString("Nombre"));
		
		Intent intent = getIntent();		
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		TextView textView = new TextView(this);
		textView.setTextSize(40);
		textView.setText(message);
		setContentView(textView);
	}
}
