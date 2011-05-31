package com.etc.systax.treeset;

import java.util.*;
class  TreeSetTest
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		//ts.add("one");
		ts.add(new Student(1,"zhangsan"));
		ts.add(new Student(3,"wangwu"));
		ts.add(new Student(4,"lisi"));
		ts.add(new Student(2,"liusanjie"));
		Iterator it= ts.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
class Student implements Comparable
{
	int num;
	String name;
	Student(int num,String name)
	{
		this.num=num;
		this.name=name;
	}
	public int compareTo(Object o)
	{
		Student s=(Student)o;
		return num > s.num ? 1 : (num==s.num ? 0 : -1);
	}
	public String toString()
	{
		return "student's name "+name+",num "+num;
	}
	static class StudentComparator implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			int result= s1.num>s2.num ? 1: ( s1.num==s2.num ? 0 : -1);
			if (result==0)
			{
				result=s1.name.compareTo(s2.name);
			}
			return result;
		}
	};
};

