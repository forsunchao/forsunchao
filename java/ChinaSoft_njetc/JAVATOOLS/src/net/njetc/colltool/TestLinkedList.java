package net.njetc.colltool;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	List<String> list=new  LinkedList<String>();
	list.add("nanjing");
	list.add("beijing");
	list.add("shanghai");
	list.add("shenzheng");
	list.add("shanghai");
	list.add(null);
	list.add(null);
	System.out.println(list.size());
	//±éÀúlinkedList ·½·¨1
	Iterator <String> iterator=  list.iterator();
	while(iterator.hasNext())
	{System.out.println(iterator.next());
	}
	}

}
