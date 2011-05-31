package com.etc.systax.iterator;

import java.util.*;
public class IteratorTest1
{
	public static void printElements(Collection c)	
//传入的参数只要继承Collection接口就可以，任何类型都可以打印出来
	{
		Iterator it=c.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) 
	{
	ArrayList al=new ArrayList();
		al.add(new Point(3,3));
		al.add(new Point(2,2));
		al.add(new Point(4,4));
		System.out.println(al);
		Object[] objs=al.toArray();
		for(int i=0;i<objs.length;i++)
		{
			System.out.println(objs[i]);
		}
		List l=Arrays.asList(objs);
		System.out.println(l);
		printElements(al); 
		printElements(l);	//对list对象打印
	}
}
//class Point
//{
//	int x=1,y=1;
//	Point(int x,int y)
//	{
//		this.x=x;
//		this.y=y;
//	}
//	public String toString()
//	{
//		return ("x="+ x+",y="+y);
//	}
//}

