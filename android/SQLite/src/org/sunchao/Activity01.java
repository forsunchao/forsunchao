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
        //创建数据库
        button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//生成一个助手类的对象，调用两个参数的构造函数
				DatabaseHelper db = new DatabaseHelper(Activity01.this, "test_sunchao_db");
				SQLiteDatabase sqLiteDatabase = db.getReadableDatabase();
			}
		});
        //更新数据库版本
        button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//调用三个参数的构造函数,version变了，android就知道是更新
				DatabaseHelper db = new DatabaseHelper(Activity01.this, "test_sunchao_db", 2);
				SQLiteDatabase sqLiteDatabase = db.getReadableDatabase();
			}
		});
        //插入数据
        button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// 得到ContentValue对象
				ContentValues values = new ContentValues();
				//键值对
				values.put("id", 1);
				values.put("name", "sunchao");
				DatabaseHelper db = new DatabaseHelper(Activity01.this, "test_sunchao_db");
				//得到可写的数据库对象
				SQLiteDatabase sqLiteDatabase = db.getWritableDatabase();
				sqLiteDatabase.insert("user", null, values);
			}
		});
        //删除数据
        button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				DatabaseHelper db = new DatabaseHelper(Activity01.this, "test_sunchao_db");
				SQLiteDatabase sqLiteDatabase = db.getWritableDatabase();
				sqLiteDatabase.delete("user", "id=?", new String[]{"1"});
			}
		});
        //更新表中数据
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
        //查询数据
        button6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				DatabaseHelper db = new DatabaseHelper(Activity01.this, "test_sunchao_db");
				//查询只需要创建只读的对象
				SQLiteDatabase sqLiteDatabase = db.getReadableDatabase();
				//游标对象
				Cursor cursor = sqLiteDatabase.query("user", new String[]{"id","name"}, 
						"id=?", new String[]{"1"}, null, null, null);
				//遍历
				while(cursor.moveToNext()) {
					String name = cursor.getString(cursor.getColumnIndex("name"));
					System.out.println("query-->" + name);
				}
			}
		});
    }
}