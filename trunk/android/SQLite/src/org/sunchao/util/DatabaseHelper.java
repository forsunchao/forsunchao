package org.sunchao.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
	private final static int VERSION=1;
	//ȫ�������캯��
	public DatabaseHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}
	//���������Ĺ��캯������������Ĺ��캯��
	public DatabaseHelper(Context context, String name, int version) {
		this(context, name, null, version);
		// TODO Auto-generated constructor stub
	}
	//���������Ĺ��캯�����������������Ĺ��캯��
	public DatabaseHelper(Context context, String name) {
		this(context, name, null, VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		System.out.println("a database created");
		//������
		arg0.execSQL("create table user(id int, name varchar(20))");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		System.out.println("a database upgraded");
	}

}
