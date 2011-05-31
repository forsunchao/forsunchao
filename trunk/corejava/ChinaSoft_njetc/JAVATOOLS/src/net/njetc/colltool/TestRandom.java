package net.njetc.colltool;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class TestRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		//System.out.println(rd.nextInt(500));
		int times = 10000;
		Map<String, String> dataMap = new HashMap<String, String>();
		int nextInt;
		String count;
		for (int index = 1; index <= times; index++) {
			nextInt = rd.nextInt(100);
		    count=dataMap.get(String.valueOf(nextInt));
			if (count != null) {
				dataMap.put(String.valueOf(nextInt), String.valueOf(Integer.valueOf(count).intValue()+1));
			} else {
				dataMap.put(String.valueOf(nextInt), "1");
			}

		}
		Iterator <String> keys	=dataMap.keySet().iterator();
		String key;
		while(keys.hasNext()){
			key=keys.next();
			System.out.println("数字\""+key+"\"出现"+dataMap.get(key)+"次");
		}
	}
}
