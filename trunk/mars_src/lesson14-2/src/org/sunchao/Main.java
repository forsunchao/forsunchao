package org.sunchao;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class Main extends Activity {
	private ProgressBar progressBar;
	private Button button;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		progressBar = (ProgressBar) findViewById(R.id.progressbar);
		button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				progressBar.setVisibility(View.VISIBLE);
				handler.post(r);
			}
		});
	}

	Handler handler = new Handler() {

		@Override
		public void handleMessage(Message msg) {
			progressBar.setProgress(msg.arg1);
			progressBar.setSecondaryProgress(msg.arg1 + 10);
			handler.post(r);
		}

	};

	Runnable r = new Runnable() {
		int i = 0;

		@Override
		public void run() {
			Log.d("run", "Begin Thread");
			i = i + 10;
			Message msg = handler.obtainMessage();
			msg.arg1 = i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			handler.sendMessage(msg);
			if (i == 100) {
				handler.removeCallbacks(r);
			}
		}
	};

}