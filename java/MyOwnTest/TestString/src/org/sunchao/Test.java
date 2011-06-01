package org.sunchao;

public class Test {
	private static final int TIMES = 1000000;

	public static void testString(String s) {
		for (int i = 0; i < TIMES; i++) {
			s += "world";
		}
	}

	public static void testStringBuffer(StringBuffer s) {
		for (int i = 0; i < TIMES; i++) {
			s.append("world");
		}
	}

	public static void testStringBuilder(StringBuilder s) {
		for (int i = 0; i < TIMES; i++) {
			s.append("world");
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		testString("hello");
		long end = System.currentTimeMillis();
		System.out.println("String-------->" + (end - start) + "∫¡√Î");

		long start1 = System.currentTimeMillis();
		testStringBuffer(new StringBuffer("hello"));
		long end1 = System.currentTimeMillis();
		System.out.println("StringBuffer-------->" + (end1 - start1) + "∫¡√Î");

		long start2 = System.currentTimeMillis();
		testStringBuilder(new StringBuilder("hello"));
		long end2 = System.currentTimeMillis();
		System.out.println("StringBuilder-------->" + (end2 - start2) + "∫¡√Î");
	}

}
