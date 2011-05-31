package com.etc.systax.hashset;

import java.util.*;
class HashSetTest 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("one");
		Iterator it=hs.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

