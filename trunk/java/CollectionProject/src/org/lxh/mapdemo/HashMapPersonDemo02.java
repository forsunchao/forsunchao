package org.lxh.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapPersonDemo02 {
	public static void main(String[] args) {
		Map<Person, String> map = new HashMap<Person, String>();
		map.put(new Person("张三", 30), "zs");
		System.out.println(map.get(new Person("张三", 30)));
	}

}
