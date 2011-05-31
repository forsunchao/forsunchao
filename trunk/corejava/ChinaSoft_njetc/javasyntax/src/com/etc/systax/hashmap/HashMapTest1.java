package com.etc.systax.hashmap;

import java.util.*;
class  HashMapTest1
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

//		System.out.println(hm.get("one"));

		Set keys=hm.keySet();	//SetÀàÃ»ÓÐget•½•¨£¬ËùÒÔÖ»ÄÜÊ¹ÓÃIterator
		System.out.println("****key:****");
		printElements(keys);
		Collection values=hm.values();	//SetÀàÃ»ÓÐget•½•¨£¬ËùÒÔÖ»ÄÜÊ¹ÓÃIterator
		System.out.println("****value:****");
		printElements(values);
		Set entry=hm.entrySet();
		System.out.println("****entry:****");
		printElements(entry);
		Iterator it=entry.iterator();
		while (it.hasNext())
		{
			Map.Entry me=(Map.Entry) it.next();	//分解entry对象
			System.out.println(me.getKey() + ":"+me.getValue());
		}
	}	
}

