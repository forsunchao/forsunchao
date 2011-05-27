package org.lxh.numberformatdemo;

import java.text.NumberFormat;

public class NumberFormatDemo {
	public static void main(String args[]) {
		int temp = 1000010000;
		NumberFormat num = NumberFormat.getInstance() ;
		System.out.println(num.format(temp));
	}
}
