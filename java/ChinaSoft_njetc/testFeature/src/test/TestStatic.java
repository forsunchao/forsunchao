package test;

import static java.lang.Math.pow;
import static java.lang.Math.*;

public class TestStatic {

	public static void main(String[] args) {
		// 旧的方式
		double d = Math.sqrt(Math.pow(2, 2) + Math.pow(4, 2));
		System.out.println(d);
		
		// 新的方式
		double d2 = sqrt(pow(2, 2) + pow(4, 2));
		System.out.println(d2);
	}
}
