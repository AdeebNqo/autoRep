package com.adeeb.autorep;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class Call_Receiver extends BroadcastReceiver{
	
	@Override
	public void onReceive(Context arg0, Intent arg1) {
		Toast.makeText(arg0, "Hello World", Toast.LENGTH_LONG).show();
		int state = Main_screen.tm.getCallState();
		switch(state){
		case TelephonyManager.CALL_STATE_IDLE:
			if (Main_screen.missed_call>0){
				Toast.makeText(arg0, "Missed call", Toast.LENGTH_LONG).show();
			}
			else if (Main_screen.missed_call<=0){
				Toast.makeText(arg0, "No missed call", Toast.LENGTH_LONG).show();
			}
			Main_screen.missed_call = 0;
			break;
		case TelephonyManager.CALL_STATE_OFFHOOK:
			//answered
			Toast.makeText(arg0, "offhook", Toast.LENGTH_LONG).show();
			--Main_screen.missed_call;
			break;
		case TelephonyManager.CALL_STATE_RINGING:
			//ringing
			Toast.makeText(arg0, "ringing", Toast.LENGTH_LONG).show();
			++Main_screen.missed_call;
			break;
		}
	}
}
