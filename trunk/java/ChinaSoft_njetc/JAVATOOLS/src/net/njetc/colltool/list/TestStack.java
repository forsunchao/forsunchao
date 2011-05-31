package net.njetc.colltool.list;

import java.util.Stack;

public class TestStack {

	/**
	 * Stack
	 */
	public static void main(String[] args) {
		Stack<String> strSta=new Stack<String>();
		strSta.push("nanjing");
		strSta.push("shanghai");
		strSta.push("beijing");
		strSta.push(null);
		strSta.push("guangdong");
		System.out.println(strSta.size());
		//查看栈顶对象而不移除它。
		System.out.println(strSta.peek());
		System.out.println(strSta.size());
		//移除栈顶对象并作为此函数的值返回该对象。
		System.out.println(strSta.pop());
		System.out.println(strSta.size());
	}

}
