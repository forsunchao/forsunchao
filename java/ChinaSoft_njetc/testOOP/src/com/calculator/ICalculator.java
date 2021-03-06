package com.calculator;

/**
 * @author wangxy
 * 计算器接口类
 */
public interface ICalculator {
	/**
	 * 计算表达式接口
	 * @param expression 待计算的表达式
	 * @return 计算结果
	 */
	public int caculate(String expression);
}
