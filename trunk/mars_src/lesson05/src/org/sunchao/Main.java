package org.sunchao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	private Button myButton;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        myButton = (Button) findViewById(R.id.myButton);
        myButton.setText(R.string.click);
        myButton.setOnClickListener(new MyButtonListener());
    }
    
    class MyButtonListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.putExtra("name", "sunchao");
			intent.setClass(Main.this, Other.class);
			startActivity(intent);
		}
    	
    }
}