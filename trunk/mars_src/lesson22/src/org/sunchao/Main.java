package org.sunchao;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	private Button register;
	private Button unregister;
	private MBroadcastReceiver receiver;
	private static final String SMS = "android.provider.Telephony.SMS_RECEIVED";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		register = (Button) findViewById(R.id.register);
		unregister = (Button) findViewById(R.id.unregister);
		register.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				IntentFilter intentFilter = new IntentFilter();
				receiver = new MBroadcastReceiver();
				intentFilter.addAction(SMS);
				registerReceiver(receiver, intentFilter);
			}
		});
		unregister.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				unregisterReceiver(receiver);
			}
		});
	}
}