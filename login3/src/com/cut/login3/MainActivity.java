package com.cut.login3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	EditText nombre;
	EditText contraseñal;
	Button Entrada;
	Button salida;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		nombre = (EditText)findViewById(R.id.editUser);
		contraseñal= (EditText)findViewById(R.id.editPass);
		Entrada = (Button)findViewById(R.id.btnLogin);
		salida = (Button)findViewById(R.id.btnCancel);
		Entrada.setOnClickListener(this);
		salida.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String na = nombre.getText().toString();
		String pa = contraseñal.getText().toString();
		
		switch (v.getId()) {
		case R.id.btnLogin:
			
				if (na.equals("Berenice") && pa.equals("1234")){
					Intent i=new Intent(this,Second.class);
					//startActivity(i);
					Second B = new Second();
					B.enviarMail();
				
				}
			
			break;
			
		case R.id.btnCancel:
			
				nombre.setText(" ");
				contraseñal.setText(" ");
			
			break;
		default:
			
			break;
			
		
		}
		
	}
}
