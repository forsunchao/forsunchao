package org.sunchao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends Activity {

	private TextView result;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
		result = (TextView) findViewById(R.id.result);
		Intent intent = getIntent();
		int one = Integer.parseInt(intent.getStringExtra("one"));
		int two = Integer.parseInt(intent.getStringExtra("two"));
		int resultInt = one * two;
		result.setText(resultInt + "");
	}
	
}
