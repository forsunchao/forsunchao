package org.sunchao;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TextView myTextView = (TextView) findViewById(R.id.myTextView);
		Button myButton = (Button) findViewById(R.id.myButton);
		myTextView.setText("这是我的第一个TextView");
		myButton.setText("请点击");
	}
}