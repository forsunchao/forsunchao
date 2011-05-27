package org.sunchao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Other extends Activity {
	private TextView myTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
		myTextView = (TextView) findViewById(R.id.myTextView);
		Intent intent = getIntent();
		String value = intent.getStringExtra("name");
		//myTextView.setText(R.string.content);
		myTextView.setText(value);
	}
	
}
