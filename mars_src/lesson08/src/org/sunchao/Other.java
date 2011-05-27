package org.sunchao;

import android.app.Activity;
import android.os.Bundle;

public class Other extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	System.out.println("Other Activity-------->onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
    }

	@Override
	protected void onDestroy() {
		System.out.println("Other Activity-------->onDestroy()");
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		System.out.println("Other Activity-------->onPause()");
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onRestart() {
		System.out.println("Other Activity-------->onRestart()");
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		System.out.println("Other Activity-------->onResume()");
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onStart() {
		System.out.println("Other Activity-------->onStart()");
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onStop() {
		System.out.println("Other Activity-------->onStop()");
		// TODO Auto-generated method stub
		super.onStop();
	}
}