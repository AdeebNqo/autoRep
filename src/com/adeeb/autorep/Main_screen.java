package com.adeeb.autorep;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main_screen extends Activity implements OnClickListener {

	static int missed_call = 0;
	static int num_missed_calls = 0;
	static TelephonyManager tm;
	static String username;
	static String other_num;
	
	EditText username_text;
	EditText number_text;
	Button save_button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_screen);
		
		//Toast.makeText(getBaseContext(), "before tm", Toast.LENGTH_LONG).show();
		tm = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
		username_text = (EditText)findViewById(R.id.editText1);
		number_text = (EditText)findViewById(R.id.alt_num);
		save_button = (Button)findViewById(R.id.button1);
		save_button.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_screen, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		Toast.makeText(getBaseContext(), "Done", Toast.LENGTH_LONG).show();
		username = username_text.getText().toString();
		other_num = number_text.getText().toString();
	}

}
