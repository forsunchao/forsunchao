package org.sunchao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MyDatabaseHelper extends SQLiteOpenHelper {
	private static int version = 1;
	private static final String TAG = "MyDatabaseHelper";

	public MyDatabaseHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}
	
	public MyDatabaseHelper(Context context, String name, int version) {
		this(context, name, null, version);
	}
	
	public MyDatabaseHelper(Context context, String name) {
		this(context, name, version);
	}

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		Log.d(TAG, "create a database");
		arg0.execSQL("create table user(id int,name varchar(20))");

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.d(TAG, "upgrade the database");
	}

}
