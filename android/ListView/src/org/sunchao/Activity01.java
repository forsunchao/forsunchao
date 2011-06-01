package org.sunchao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

public class Activity01 extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		SimpleAdapter adapter = new SimpleAdapter(this, getData(),
				R.layout.main, new String[] { "img", "title", "info" },
				new int[] { R.id.image, R.id.text01, R.id.text02 });
		setListAdapter(adapter);
	}

	public List<Map<String, Object>> getData() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("img", R.drawable.icon);
		map1.put("title", "sc");
		map1.put("info", "Ëï³¬");

		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("img", R.drawable.icon);
		map2.put("title", "yxy");
		map2.put("info", "ÓÚÏþÑà");

		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("img", R.drawable.icon);
		map3.put("title", "yxh");
		map3.put("info", "ÓÚÐ¡»¢");
		list.add(map1);
		list.add(map2);
		list.add(map3);
		return list;
	}
}