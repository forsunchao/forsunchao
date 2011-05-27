package org.lxh.sytemiodemo;

public class SystemErrDemo {
	public static void main(String[] args) {
		try {
			Integer.parseInt("hello");
		} catch (Exception e) {
			System.out.println(e);
			System.err.println(e);
		}
	}

}
