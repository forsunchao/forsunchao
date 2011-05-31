package com.calculator;

import com.calculator.impl.Default;
import com.calculator.impl.Devide;
import com.calculator.impl.Minus;
import com.calculator.impl.Multiply;
import com.calculator.impl.Plus;

public class Test {

	public static void main(String[] args) {
		while (true) {
			// 接收表达式输入
			System.out.println("准备输入：");
			String expression = System.console().readLine();
			
			// 初始化实例
			ICalculator calculator;
			if (expression.indexOf("+") != -1) {
				calculator = new Plus();
			} else if (expression.indexOf("-") != -1) {
				calculator = new Minus();
			} else if (expression.indexOf("*") != -1) {
				calculator = new Multiply();
			} else if (expression.indexOf("/") != -1) {
				calculator = new Devide();
			} else {
				calculator = new Default();
			}
			
			// 开始运算
			try {
				int value = calculator.caculate(expression);
				System.out.println("="+value);
			} catch (CalculatorException e) {
				System.out.println(e);
			}
		}

	}

}
