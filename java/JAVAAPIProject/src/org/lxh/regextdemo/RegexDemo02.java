package org.lxh.regextdemo;

public class RegexDemo02 {

	public static void main(String[] args) {
		String str = "121s34123414123";
		if (str.matches("\\d+")) {// 使用正则
			System.out.println("字符串是由数字组成！");
		} else {
			System.out.println("字符串不是由数字组成！");
		}
	}
}
