package com.calculator;

public class CalculatorException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public CalculatorException(String msg) {
		super("数字转换异常：" + msg);
	}
}
