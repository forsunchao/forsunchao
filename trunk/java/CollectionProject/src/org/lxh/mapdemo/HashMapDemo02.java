package org.lxh.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo02 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhangsan", 1);
		map.put("zhangsan", 2);
		map.put("lisi", 3);
		map.put("wangwu", 5);
		Integer value = map.get("zhangsan") ;
		System.out.println(value) ;
	}

}
