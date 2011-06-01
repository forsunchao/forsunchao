package org.sunchao;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Activity01 extends Activity {
    /** Called when the activity is first created. */
	private TextView textView01;
	private RadioGroup genderGroup;
	private RadioButton maleButton;
	private RadioButton femaleButton;
	private CheckBox swimBox;
	private CheckBox readBox;
	private CheckBox runBox;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        textView01 = (TextView) findViewById(R.id.textView01);
        genderGroup = (RadioGroup) findViewById(R.id.genderGroup);
        maleButton = (RadioButton) findViewById(R.id.maleButton);
        femaleButton = (RadioButton) findViewById(R.id.femaleButton);
        swimBox = (CheckBox) findViewById(R.id.swimBox);
        readBox = (CheckBox) findViewById(R.id.readBox);
        runBox = (CheckBox) findViewById(R.id.runBox);
        //��ѡ��ť�¼���ע���¼���ť��֮ǰ��һ��
        genderGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				if (maleButton.getId() == checkedId) {
					//�³�һ��С���
					Toast.makeText(Activity01.this, "male", Toast.LENGTH_LONG).show();
				} else {
					Toast.makeText(Activity01.this, "female", Toast.LENGTH_LONG).show();
				}
			}
		});
        //��ѡ��ť�¼�--1
        swimBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked) {
					System.out.println("swim is checked");
				} else {
					System.out.println("swim is unchecked");
				}
			}
		});
        //��ѡ��ť�¼�--2
        readBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked) {
					System.out.println("read is checked");
				} else {
					System.out.println("read is unchecked");
				}
			}
		});
        //��ѡ��ť�¼�--3
        runBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked) {
					System.out.println("run is checked");
				} else {
					System.out.println("run is unchecked");
				}
			}
		});
    }
}