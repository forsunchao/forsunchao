package org.lxh.largenumberdemo;

import java.math.BigDecimal;

class MyMath {
	public static double add(String num1, String num2) {
		BigDecimal bd1 = new BigDecimal(num1);
		BigDecimal bd2 = new BigDecimal(num2);
		return bd1.add(bd2).doubleValue();
	}

	public static double sub(String num1, String num2) {
		BigDecimal bd1 = new BigDecimal(num1);
		BigDecimal bd2 = new BigDecimal(num2);
		return bd1.subtract(bd2).doubleValue();
	}

	public static double mul(String num1, String num2) {
		BigDecimal bd1 = new BigDecimal(num1);
		BigDecimal bd2 = new BigDecimal(num2);
		return bd1.multiply(bd2).doubleValue();
	}

	public static double div(String num1, String num2, int scale) {
		BigDecimal bd1 = new BigDecimal(num1);
		BigDecimal bd2 = new BigDecimal(num2);
		return bd1.divide(bd2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	public static double round(double num, int scale) {
		BigDecimal bd1 = new BigDecimal(num);
		BigDecimal bd2 = new BigDecimal(1);
		return bd1.divide(bd2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}

public class BigDecimalDemo {
	public static void main(String[] args) {
		String num1 = "12345.07891";
		String num2 = "3333.5101";
		System.out.println("�ӷ�������" + MyMath.round(MyMath.add(num1, num2), 2));
		System.out.println("����������" + MyMath.round(MyMath.sub(num1, num2), 2));
		System.out.println("�˷�������" + MyMath.round(MyMath.mul(num1, num2), 2));
		System.out.println("����������" + (MyMath.div(num1, num2, 2)));
	}
}
