package com.calculator.impl;

import com.calculator.AbstractCalculator;
import com.calculator.ICalculator;
import com.calculator.CalculatorException;

/**
 * @author liuzhongbing
 * 加法计算类
 */
public class Plus extends AbstractCalculator implements ICalculator {
	public int caculate(String expression) throws CalculatorException {
		int arrayInt[] = split(expression, "\\+");
		return arrayInt[0] + arrayInt[1];
	}
}
