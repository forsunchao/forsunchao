package com.etc.systax;

public class AssignTest {

	public static void main(String args[]) {
		int x, y; // declare int
		// variables
		float z = 3.414f; // declare and assign
		// float
		double w = 3.1415; // declare and assign
		// double
		boolean truth = true; // declare and assign
		// boolean
		char c; // declare character
		// variable
		String str; // declare String
		String str1 = "bye"; // declare and assign
		// String variable
		c = 'A'; // assign value to char
		// variable
		str = "Hi out there!"; // assign value to
		// String variable
		x = 6;
		y = 1000; // assign values to int variables
		// float d=123.4E+36D;
	}

	// 非法赋值举例
	// y = 3.1415926; // 3.1415926 is not an int.
	// Requires casting and decimal will
	// be truncated.
	// w = 175,000; // the comma symbol ( , ) cannot appear
	// truth = 1; // a common mistake made by ex- C / C++
	// programmers.
	// z = 3.14156 ; //can't fit double into a
	// Float. Requires casting.
}