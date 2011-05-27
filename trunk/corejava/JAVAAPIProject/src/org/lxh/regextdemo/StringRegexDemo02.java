package org.lxh.regextdemo;

public class StringRegexDemo02 {

	public static void main(String[] args) {
		String str = "aa@aa.com.cn" ;
		String regex = "\\w+@\\w+.(com|net.cn)" ;
		System.out.println(str.matches(regex)) ;
	}

}
