package com.etc.systax.hashset;

import java.util.*;
class HashSetTest2 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(new Student2(1,"zhangsan"));
		hs.add(new Student2(2,"lisi"));
		hs.add(new Student2(3,"wangwu"));
		hs.add(new Student2(1,"zhangsan"));

		Iterator it=hs.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
class Student2
{
	int num;
	String name;
	Student2(int num,String name)
	{
		this.num=num;
		this.name=name;
	}
	public boolean equals(Object o)
	{
		Student s=(Student)o;
		return num==s.num && name.equals(s.name);	//利用String类的equals方法，String中的equals被重写了
	}
	public int hashCode()
	{
		return num*name.hashCode(); //String中的hashCode被重写了
	} 
	public String toString()
	{
		return num+":"+name;
	}
}

