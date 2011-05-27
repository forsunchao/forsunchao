package org.sunchao;

public class Test {

	public static void main(String[] args) {
		Singleton sing = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();

		System.out.println(sing);
		System.out.println(sing2);
		System.out.println("两个对象是否是同一个----->" + (sing==sing2));
		
		String s1 = new String("aa");
		String s2 = new String("aa");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("两个对象是否是同一个----->" + (s1==s2));
	}
}
