package org.sunchao;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	private Button create, upgrade, insert, delete, update, query;
	private static final String TAG = "Main";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		init();
		create.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MyDatabaseHelper helper = new MyDatabaseHelper(Main.this, "test_db");
				SQLiteDatabase db = helper.getReadableDatabase();
			}
		});

		upgrade.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MyDatabaseHelper helper = new MyDatabaseHelper(Main.this, "test_db");
				SQLiteDatabase db = helper.getReadableDatabase();
			}
		});

		insert.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MyDatabaseHelper helper = new MyDatabaseHelper(Main.this, "test_db");
				SQLiteDatabase db = helper.getWritableDatabase();
				ContentValues values = new ContentValues();
				values.put("id", 1);
				values.put("name", "sunchao");
				db.insert("user", null, values);
			}
		});
		
		delete.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MyDatabaseHelper helper = new MyDatabaseHelper(Main.this, "test_db");
				SQLiteDatabase db = helper.getWritableDatabase();
				db.delete("user", "id=?", new String[]{"1"});
			}
		});
		
		update.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MyDatabaseHelper helper = new MyDatabaseHelper(Main.this, "test_db");
				SQLiteDatabase db = helper.getWritableDatabase();
				ContentValues values = new ContentValues();
				values.put("name", "yuxiaoyan");
				db.update("user", values, "id=?", new String[]{"1"});

			}
		});
		
		query.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MyDatabaseHelper helper = new MyDatabaseHelper(Main.this, "test_db");
				SQLiteDatabase db = helper.getReadableDatabase();
				Cursor cursor = db.query("user", new String[]{"id", "name"}, null, null, null, null, null);
				while (cursor.moveToNext()) {
					String id = cursor.getString(cursor.getColumnIndex("id"));
					String name = cursor.getString(cursor.getColumnIndex("name"));
					Log.d(TAG, "id = " + id + ", name = " + name);
				}
			}
		});
	}

	public void init() {
		create = (Button) findViewById(R.id.create);
		upgrade = (Button) findViewById(R.id.upgrade);
		insert = (Button) findViewById(R.id.insert);
		delete = (Button) findViewById(R.id.delete);
		update = (Button) findViewById(R.id.update);
		query = (Button) findViewById(R.id.query);
	}
}