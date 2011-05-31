package net.njetc.colltool.list;

import java.util.ArrayList;
import java.util.List;

public class TestArryList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("shanghai");
		strList.add("nanjing");
		strList.add(null);
		System.out.println(strList.size());
		System.out.println(strList.get(0));
		//strList.remove(0);
		strList.remove("shanghai");
		System.out.println(strList.size());
	}

}
