package com.etc.systax.camparable;

class Student implements Comparable		//实现comparable接口
{
	int num;
	String name;
	Student(int num,String name)
	{
		this.num=num;
		this.name=name;
	}
	public int compareTo(Object o)		//必须实现comparable接口的compareTo（）方法
	{
		Student s=(Student)o;
		return num > s.num ? 1 : (num==s.num ? 0 : -1);
	}
	public String toString()
	{
		return "student's name "+name+",num "+num;
	}
};
