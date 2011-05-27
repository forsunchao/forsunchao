package org.sunchao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	System.out.println("Main Activity---->onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
		        intent.setClass(Main.this, Other.class);
		        startActivity(intent);
			}
		});
        
    }

	@Override
	protected void onDestroy() {
		System.out.println("Main Activity---->onDestroy()");
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		System.out.println("Main Activity---->onPause()");
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onRestart() {
		System.out.println("Main Activity---->onRestart()");
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		System.out.println("Main Activity---->onResume()");
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onStart() {
		System.out.println("Main Activity---->onStart()");
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onStop() {
		System.out.println("Main Activity---->onStop()");
		// TODO Auto-generated method stub
		super.onStop();
	}
}