package org.sunchao;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class Activity01 extends Activity {
    /** Called when the activity is first created. */
	private ProgressBar progressBar1;
	private ProgressBar progressBar2;
	private Button button1;
	int i = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        progressBar1 = (ProgressBar) findViewById(R.id.progressBar1);
        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (i == 0) {
					progressBar1.setVisibility(View.VISIBLE);
					progressBar2.setVisibility(View.VISIBLE);
				} else if(i < 100) {
					progressBar1.setProgress(i);
					//水平的两个进度值
					progressBar2.setProgress(i);
					progressBar2.setSecondaryProgress(i + 10);
				} else {
					progressBar1.setVisibility(View.GONE);
					progressBar2.setVisibility(View.GONE);
				}
				i = i + 10;
			}
		});
    }
}