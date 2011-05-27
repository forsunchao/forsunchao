package org.sunchao;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	private Button start;
	private Button end;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		start = (Button) findViewById(R.id.start);
		end = (Button) findViewById(R.id.end);
		start.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Log.d("start", "Start Button");
				handler.post(r);
			}
		});
		end.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Log.d("end", "End Button");
				handler.removeCallbacks(r);
			}
		});
	}
	
	Handler handler = new Handler();
	Runnable r = new Runnable() {
		
		@Override
		public void run() {
			Log.d("run", "Begin to Update");
			handler.postDelayed(r, 3000);
		}
	};
}