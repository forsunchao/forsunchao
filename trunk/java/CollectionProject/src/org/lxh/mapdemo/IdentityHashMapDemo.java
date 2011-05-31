package org.lxh.mapdemo;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new IdentityHashMap<String, Integer>();
		map.put(new String("zhangsan"), 1);
		map.put(new String("zhangsan"), 2);
		Set<String> set = map.keySet(); // 返回全部的key
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " --> " + map.get(key));
		}
	} 

}
