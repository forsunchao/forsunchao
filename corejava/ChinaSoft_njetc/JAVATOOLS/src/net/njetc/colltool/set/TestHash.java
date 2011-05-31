package net.njetc.colltool.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHash {

	/**
	 * HashSet¿‡
	 */
	public static void main(String[] args) {
		Set<String> strSet = new HashSet<String>();
		strSet.add("naning");
		strSet.add("shanghai");
		strSet.add("beijing");
		strSet.add("shanghai");
		strSet.add("shanghai");
		strSet.add("aomeng");
		strSet.add("qingdao");
		strSet.add(null);
		strSet.add(null);
		Iterator<String> itStr = strSet.iterator();
		while (itStr.hasNext()) {
			System.out.println(itStr.next());
	   }

	}

}
