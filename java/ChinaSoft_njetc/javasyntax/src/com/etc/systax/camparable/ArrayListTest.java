package com.etc.systax.camparable;

import java.util.*;
class ArrayListTest 
{
	public static void printElements(Collection c)
	{
		Iterator it=c.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) 
	{
		Student s1=new Student(2,"zhangsan");
		Student s2=new Student(1,"list");
		Student s3=new Student(3,"wangwu");
		ArrayList al= new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al);		//sort()是Collections类的静态排序方法
		printElements(al);
	}
}
