package com.calculator.impl;

import com.calculator.AbstractCalculator;
import com.calculator.ICalculator;
import com.calculator.CalculatorException;

/**
 * @author liuzhongbing
 * 减法计算类
 */
public class Minus extends AbstractCalculator implements ICalculator {
	public int caculate(String expression) throws CalculatorException {
		int arrayInt[] = split(expression, "-");
		return arrayInt[0] - arrayInt[1];
	}
}
