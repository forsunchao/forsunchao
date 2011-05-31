package com.calculator.impl;

import com.calculator.AbstractCalculator;
import com.calculator.ICalculator;

/**
 * @author wangxy
 * 加法计算类
 */
public class Plus extends AbstractCalculator implements ICalculator {
	public int caculate(String expression) {
		int arrayInt[] = split(expression, "\\+");
		return arrayInt[0] + arrayInt[1];
	}
}
