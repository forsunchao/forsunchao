package org.sunchao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	private Button startButton;
	private Button stopButton;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        startButton = (Button) findViewById(R.id.startService);
        stopButton = (Button) findViewById(R.id.stopService);
        startButton.setOnClickListener(new startListener());
        stopButton.setOnClickListener(new stopListener());
    }
    class startListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(Main.this, MyService.class);
			startService(intent);
		}
    	
    }
    
    class stopListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(Main.this, MyService.class);
			stopService(intent);
		}
    	
    }
}