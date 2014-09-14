package edu.neu.madcourse.luislopez;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.telephony.TelephonyManager;

public class AboutMeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_me);


		TelephonyManager telephonyManager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
		String device_imei = telephonyManager.getDeviceId();

		// Display IMEI on screen //
		final TextView textView8 = (TextView) findViewById(R.id.textView8);
		textView8.setText(device_imei);
	}
}
