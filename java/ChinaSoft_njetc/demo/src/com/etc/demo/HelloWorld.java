package com.etc.demo;

/**
 * @author wangxy
 */
public class HelloWorld {
	
	/**
	 * 变量
	 */
	private String world = "World";
	
	/**
	 * 函数
	 */
	public void say() {
		System.out.println("Hello " + world + "!");
	}

	/**
	 * 执行入口函数
	 * @param args
	 */
	public static void main(String args[]) {
		// 创建类的实例
		HelloWorld inst = new HelloWorld();
		
		// 调用函数
		inst.say();
	}
}