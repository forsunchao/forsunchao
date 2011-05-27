package org.sunchao;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class Main extends Activity {
	private RadioGroup rg1;
	private RadioButton rb1;
	private RadioButton rb2;
	private CheckBox cb1;
	private CheckBox cb2;
	private CheckBox cb3;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        rg1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if (rb1.getId() == checkedId ) {
					Toast.makeText(Main.this, "你是男生", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(Main.this, "你是女生", Toast.LENGTH_LONG).show();
				}
			}
		});
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked) {
					Toast.makeText(Main.this, "我爱周杰伦", Toast.LENGTH_SHORT).show();
				}
			}
		});
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked) {
					Toast.makeText(Main.this, "我爱王力宏", Toast.LENGTH_SHORT).show();
				}
			}
		});
        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked) {
					Toast.makeText(Main.this, "我爱许嵩", Toast.LENGTH_SHORT).show();
				}
			}
		});
    }
}