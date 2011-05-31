package com.etc.systax;

/**
 * 
 * @author wangxy
 *
 */

public class HelloWorld3 {
	static String hello = "Hello, ";// 成员变量 
	String world = "World"; // 成员变量 - 实例变量

	public void say() {
		String world = "China"; 
		System.out.println(HelloWorld3.hello + world);
		System.out.println(HelloWorld3.hello + this.world);
	}

	public static void main(String args[]) {
		HelloWorld3 inst = new HelloWorld3();
		inst.say();
	}
}
