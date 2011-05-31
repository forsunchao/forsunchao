package org.lxh.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapPersonDemo01 {
	public static void main(String[] args) {
		Map<String, Person> map = new HashMap<String, Person>();
		map.put(new String("zs"), new Person("уехЩ", 30));
		System.out.println(map.get(new String("zs")));
	}

}
