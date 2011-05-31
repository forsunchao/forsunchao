package org.lxh.regextdemo;

public class StringRegexDemo01 {

	public static void main(String[] args) {
		String str = "aaaaaaaaa" ;
		System.out.println(str.matches("\\w{6,15}")) ;
	}

}
