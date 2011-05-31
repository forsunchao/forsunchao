package com.etc.systax.stack;

import java.util.*;
class MyStack 
{
	private LinkedList ll=new LinkedList();
	public void push(Object o)
	{
		ll.addFirst(o);
	}
	public Object pop()
	{
		return ll.removeFirst();
	}
	public Object peek()
	{
		return ll.getFirst();
	}
	public boolean empty()
	{
		return ll.isEmpty();
	}
	public static void main(String[] args) 
	{
		MyStack ms= new MyStack();
		ms.push("one");
		ms.push("Two");
		ms.push("Three");

		System.out.println(ms.pop());
		System.out.println(ms.peek());
		System.out.println(ms.pop());
		System.out.println(ms.peek());
		System.out.println(ms.empty());
	}
}
