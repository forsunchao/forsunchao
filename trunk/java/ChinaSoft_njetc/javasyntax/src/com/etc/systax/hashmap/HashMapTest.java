package com.etc.systax.hashmap;

//import java.util.*;
//class  HashMapTest
//{
//	public static void main(String[] args) 
//	{
//		HashMap hm=new HashMap();
//		hm.put("one","zhangsan");
//		hm.put("two","wangwu");
//		hm.put("three","lisi");
//		System.out.println(hm.get("one"));
//	}
//}

//keySet()和values()
import java.util.*;
class  HashMapTest
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
		HashMap hm=new HashMap();
		hm.put("one","zhangsan");
		hm.put("two","wangwu");
		hm.put("three","lisi");

		Set keys=hm.keySet();	//Set类没有get方法，所以只能使用Iterator
		System.out.println("****key:****");
		printElements(keys);
		Collection values=hm.values();	
		System.out.println("****value:****");
		printElements(values);
	}	
}

