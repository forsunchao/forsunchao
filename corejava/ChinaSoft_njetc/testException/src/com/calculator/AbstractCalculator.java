package com.calculator;

/**
 * @author liuzhongbing
 * 计算器抽象类
 */
public abstract class AbstractCalculator {

	/**
	 * 根据计算表达式，提取待计算的数值
	 * @param expression 计算表达式
	 * @param deliString 分隔符
	 * @return 待计算数值的数组
	 */
	public int[] split(String expression, String deliString) throws CalculatorException {
		String array[] = expression.split(deliString);
		int arrayInt[] = new int[2];
		try {
			arrayInt[0] = Integer.parseInt(array[0]);
			arrayInt[1] = Integer.parseInt(array[1]);
		} catch (NumberFormatException e) {
			throw new CalculatorException(e.getMessage());
		}
		return arrayInt;
	}
}
