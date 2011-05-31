package com.etc.systax.collection;

import java.util.*;

class ArrayListTest1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Point(3, 3));
		al.add(new Point(2, 2));
		al.add(new Point(4, 4));
		System.out.println(al);
		Object[] objs = al.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
		List l = Arrays.asList(objs); //使用List类的asList静态方法返回一个List对象,并且参数为）Object[ ]
		System.out.println(l);
		l.add("FouthElement"); //增加返回的List对象的元素个数，编译通过，运行会出现如下错误
		/*
		 Exception in thread "main" java.lang.UnsupportedOperationException
		 at java.util.AbstractList.add(AbstractList.java:150)
		 at java.util.AbstractList.add(AbstractList.java:88)
		 at ArrayListTest.main(ArrayListTest.java:28)
		 */

	}
}
