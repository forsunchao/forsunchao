package com.etc.systax.collection;

import java.util.*;

class ArrayListTest {
	//ArrayList类的应用代码
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("FistElement");
		al.add("SecondElement");
		al.add("ThirdElement");
		for (int i = 0; i < al.size(); i++) //ArrayList的size方法读取对象的元素个数
		{
			System.out.println(al.get(i)); //ArrayList类的get方法读取数据
		}
		System.out.println(al);

		/*
		 *利用ArrayList的toArray()返回一个数组
		ArrayList al=new ArrayList();
		al.add(new Point(3,3));
		al.add(new Point(2,2));
		al.add(new Point(4,4));
		System.out.println(al);
		Object[] objs=al.toArray();		//ArrayList类中的toArray()方法可以返回一个数组
		for(int i=0;i<objs.length;i++)
		{
			System.out.println(objs[i]);
		}
		 */
	}
}
