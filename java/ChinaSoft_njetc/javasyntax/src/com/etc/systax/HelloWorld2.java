package com.etc.systax;

public class HelloWorld2 {
	String hello = "Hello, ";

	public void say() {
		sayOne();
		sayTwo();
	}

	public void sayOne() {
		String world = "World";
		System.out.println(hello + world);
	}

	public void sayTwo() {
		String world = "China";
		System.out.println(hello + world);
	}

	public static void main(String args[]) {
		HelloWorld2 inst = new HelloWorld2();
		inst.say();
	}
}
