package org.sunchao;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class Main extends Activity {
	private ProgressBar progressBar01;
	private ProgressBar progressBar02;
	private Button button01;
	private int i = 0;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        progressBar01 = (ProgressBar) findViewById(R.id.ProgressBar01);
        progressBar02 = (ProgressBar) findViewById(R.id.ProgressBar02);
        button01 = (Button) findViewById(R.id.Button01);
        button01.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (i == 0) {
					progressBar01.setVisibility(View.VISIBLE);
					progressBar02.setVisibility(View.VISIBLE);
				} else if (i < 100) {
					progressBar01.setProgress(i);
					progressBar02.setProgress(i);
					progressBar02.setSecondaryProgress(i+10);
				} else {
					progressBar01.setVisibility(View.GONE);
					progressBar02.setVisibility(View.GONE);
				}
				i = i + 10;
			}
		});
    }
}