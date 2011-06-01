package org.sunchao;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {
	/** Called when the activity is first created. */
	Uri uri = Uri.parse("content://telephony/carriers");

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button open = (Button) findViewById(R.id.open);
		Button close = (Button) findViewById(R.id.close);

		open.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				openAPN();
			}
		});

		close.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				closeAPN();
			}
		});

	}

	public void openAPN() {

		List<APN> list = getAPNList();
		for (APN apn : list) {
			ContentValues cv = new ContentValues();
			cv.put("apn", APNMatchTools.matchAPN(apn.apn));
			cv.put("type", APNMatchTools.matchAPN(apn.type));
			getContentResolver().update(uri, cv, "_id=?",
					new String[] { apn.id });

		}
	}

	public void closeAPN() {
		List<APN> list = getAPNList();
		for (APN apn : list) {
			ContentValues cv = new ContentValues();
			cv.put("apn", APNMatchTools.matchAPN(apn.apn) + "mdev");
			cv.put("type", APNMatchTools.matchAPN(apn.type) + "mdev");
			getContentResolver().update(uri, cv, "_id=?",
					new String[] { apn.id });

		}
	}

	private List<APN> getAPNList() {
		String tag = "Main.getAPNList()";

		// current��Ϊ�ձ�ʾ����ʹ�õ�APN
		String projection[] = { "_id,apn,type,current" };
		Cursor cr = this.getContentResolver().query(uri, projection, null,
				null, null);

		List<APN> list = new ArrayList<APN>();

		while (cr != null && cr.moveToNext()) {
			Log.d(tag,
					cr.getString(cr.getColumnIndex("_id")) + "  "
							+ cr.getString(cr.getColumnIndex("apn")) + "  "
							+ cr.getString(cr.getColumnIndex("type")) + "  "
							+ cr.getString(cr.getColumnIndex("current")));
			APN a = new APN();
			a.id = cr.getString(cr.getColumnIndex("_id"));
			a.apn = cr.getString(cr.getColumnIndex("apn"));
			a.type = cr.getString(cr.getColumnIndex("type"));
			list.add(a);
		}
		if (cr != null)
			cr.close();
		return list;
	}

	public static class APN {
		String id;
		String apn;
		String type;
	}

}