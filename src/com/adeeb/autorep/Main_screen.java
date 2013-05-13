package com.adeeb.autorep;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class Main_screen extends Activity {

	static int missed_call = 0;
	static int num_missed_calls = 0;
	static TelephonyManager tm;
	static String username;
	
	EditText username_text;
	Button save_button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_screen);
		
		tm = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
		username_text = (EditText)findViewById(R.id.editText1);
		save_button = (Button)findViewById(R.id.button1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_screen, menu);
		return true;
	}

}
