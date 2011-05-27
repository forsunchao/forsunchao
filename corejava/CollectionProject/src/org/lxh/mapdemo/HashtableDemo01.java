package org.lxh.mapdemo;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		map.put("zhangsan", 1);
		map.put("zhangsan", 2);
		map.put("lisi", 3);
		map.put("wangwu", 5);
		System.out.println(map);
	}

}
