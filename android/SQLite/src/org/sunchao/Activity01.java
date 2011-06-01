package org.sunchao;

import org.sunchao.util.DatabaseHelper;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity01 extends Activity {
    /** Called when the activity is first created. */
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        //�������ݿ�
        button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//����һ��������Ķ��󣬵������������Ĺ��캯��
				DatabaseHelper db = new DatabaseHelper(Activity01.this, "test_sunchao_db");
				SQLiteDatabase sqLiteDatabase = db.getReadableDatabase();
			}
		});
        //�������ݿ�汾
        button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//�������������Ĺ��캯��,version���ˣ�android��֪���Ǹ���
				DatabaseHelper db = new DatabaseHelper(Activity01.this, "test_sunchao_db", 2);
				SQLiteDatabase sqLiteDatabase = db.getReadableDatabase();
			}
		});
        //��������
        button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// �õ�ContentValue����
				ContentValues values = new ContentValues();
				//��ֵ��
				values.put("id", 1);
				values.put("name", "sunchao");
				DatabaseHelper db = new DatabaseHelper(Activity01.this, "test_sunchao_db");
				//�õ���д�����ݿ����
				SQLiteDatabase sqLiteDatabase = db.getWritableDatabase();
				sqLiteDatabase.insert("user", null, values);
			}
		});
        //ɾ������
        button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				DatabaseHelper db = new DatabaseHelper(Activity01.this, "test_sunchao_db");
				SQLiteDatabase sqLiteDatabase = db.getWritableDatabase();
				sqLiteDatabase.delete("user", "id=?", new String[]{"1"});
			}
		});
        //���±�������
        //update table_name set xx=xx where xx=xx
        button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				DatabaseHelper db = new DatabaseHelper(Activity01.this, "test_sunchao_db");
				SQLiteDatabase sqLiteDatabase = db.getWritableDatabase();
				ContentValues values = new ContentValues();
				values.put("name", "sunchao...update");
				sqLiteDatabase.update("user", values, "id=?", new String[]{"1"});
			}
		});
        //��ѯ����
        button6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				DatabaseHelper db = new DatabaseHelper(Activity01.this, "test_sunchao_db");
				//��ѯֻ��Ҫ����ֻ���Ķ���
				SQLiteDatabase sqLiteDatabase = db.getReadableDatabase();
				//�α����
				Cursor cursor = sqLiteDatabase.query("user", new String[]{"id","name"}, 
						"id=?", new String[]{"1"}, null, null, null);
				//����
				while(cursor.moveToNext()) {
					String name = cursor.getString(cursor.getColumnIndex("name"));
					System.out.println("query-->" + name);
				}
			}
		});
    }
}