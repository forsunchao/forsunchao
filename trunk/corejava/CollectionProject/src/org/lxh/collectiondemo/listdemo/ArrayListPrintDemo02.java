package org.lxh.collectiondemo.listdemo;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListPrintDemo02 {
	public static void main(String args[]) {
		Collection<String> allList = new ArrayList<String>();// 为Collection接口实例化
		allList.add("hello");// 增加元素，Collection接口定义
		allList.add("MLDN");// 增加元素，Collection接口定义
		allList.add("world");// 增加元素，Collection接口定义
		Object obj[] = allList.toArray() ;
		for (int i = 0; i < obj.length; i++) {// 循环输出
			System.out.println(obj[i]) ;
		}
	}
}
