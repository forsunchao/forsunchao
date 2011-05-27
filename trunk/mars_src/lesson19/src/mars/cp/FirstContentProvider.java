package mars.cp;

import java.util.HashMap;

import mars.cp.FirstProviderMetaData.UserTableMetaData;
import mars.sqlite3.db.DatabaseHelper;
import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;

public class FirstContentProvider extends ContentProvider {

	public static final UriMatcher uriMatcher;
	public static final int INCOMING_USER_COLLECTION = 1;
	public static final int INCOMING_USER_SINGLE = 2;
	private DatabaseHelper dh;
	static {
		uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
		uriMatcher.addURI(FirstProviderMetaData.AUTHORIY, "/users",
				INCOMING_USER_COLLECTION);
		uriMatcher.addURI(FirstProviderMetaData.AUTHORIY, "/users/#",
				INCOMING_USER_SINGLE);
	}
	
	public static HashMap<String,String> userProjectionMap;
	static
	{
		userProjectionMap = new HashMap<String,String>();
		userProjectionMap.put(UserTableMetaData._ID,UserTableMetaData._ID);
		userProjectionMap.put(UserTableMetaData.USER_NAME, UserTableMetaData.USER_NAME);
	}
	@Override
	public int delete(Uri arg0, String arg1, String[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("delete");
		return 0;
	}

	//���ݴ����URI�����ظ�URI����ʾ����������
	@Override
	public String getType(Uri uri) {
		// TODO Auto-generated method stub
		System.out.println("getType");
		switch(uriMatcher.match(uri)){
		case INCOMING_USER_COLLECTION:
			return UserTableMetaData.CONTENT_TYPE;
		case INCOMING_USER_SINGLE:
			return UserTableMetaData.CONTENT_TYPE_ITEM;
		default:
			throw new IllegalArgumentException("Unknown URI" + uri);
		}
	}

	/**
	 * �ú����ķ���ֵ��һ��Uri�����Uri��ʾ���Ǹո�ʹ��������������������
	 * content://mars.cp.FirstContentProvider/users/1
	 */
	@Override
	public Uri insert(Uri uri, ContentValues values) {
		System.out.println("insert");
		SQLiteDatabase db = dh.getWritableDatabase();
		long rowId = db.insert(UserTableMetaData.TABLE_NAME, null, values);
		if(rowId > 0){
			Uri insertedUserUri = ContentUris.withAppendedId(UserTableMetaData.CONTENT_URI, rowId);
			//֪ͨ�������������Ѿ��ı�
			getContext().getContentResolver().notifyChange(insertedUserUri, null);
			return insertedUserUri;
		}
		throw new SQLException("Failed to insert row into" + uri);
	}

	//��һ���ص�����������˵��ContentProvider������ʱ��ִ�� 
	@Override
	public boolean onCreate() {
		//�����ݿ�  
		dh = new DatabaseHelper(getContext(),FirstProviderMetaData.DATABASE_NAME);
		System.out.println("onCreate");
		return true;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs,
			String sortOrder) {
		SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
		switch(uriMatcher.match(uri)){
		case INCOMING_USER_COLLECTION:
			qb.setTables(UserTableMetaData.TABLE_NAME);
			qb.setProjectionMap(userProjectionMap);
			break;
		case INCOMING_USER_SINGLE:
			qb.setTables(UserTableMetaData.TABLE_NAME);
			qb.setProjectionMap(userProjectionMap);
			qb.appendWhere(UserTableMetaData._ID + "=" + uri.getPathSegments().get(1));
			break;
		}
		String orderBy;
		if(TextUtils.isEmpty(sortOrder)){
			orderBy = UserTableMetaData.DEFAULT_SORT_ORDER;
		}
		else{
			orderBy = sortOrder;
		}
		SQLiteDatabase db = dh.getWritableDatabase();
		Cursor c = qb.query(db, projection, selection, selectionArgs, null, null, orderBy);
		c.setNotificationUri(getContext().getContentResolver(), uri);
		System.out.println("query");
		return c;
	}

	@Override
	public int update(Uri arg0, ContentValues arg1, String arg2, String[] arg3) {
		// TODO Auto-generated method stub
		System.out.println("update");
		return 0;
	}

}
