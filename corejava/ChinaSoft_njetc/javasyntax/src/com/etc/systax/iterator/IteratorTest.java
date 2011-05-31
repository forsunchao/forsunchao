package com.etc.systax.iterator;

import java.util.ArrayList;
import java.util.Iterator;

 class IteratorTest 
{
	public static void main(String[] args) 
	{
	ArrayList al=new ArrayList();
		al.add(new Point(3,3));
		al.add(new Point(2,2));
		al.add(new Point(4,4));
		System.out.println(al);
		Iterator it=al.iterator();	//Collection接口具有iterator（）返回一个迭代器对象
		//删除方法的使用
		it.next();
		it.remove();	//在使用remove前必须至少调用一次next()方法
		//典型的元素输出方法
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

