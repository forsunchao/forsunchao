package org.lxh.regextdemo;

import java.util.regex.Pattern;

public class PatternDemo {
	public static void main(String[] args) {
		String str = "TOM:30|JERRY:31|PARK:32";
		String regex = "\\|";
		Pattern pat = Pattern.compile(regex); // ִ�в�ֲ���
		String s1[] = pat.split(str); // ���
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);// ���
		}
	}

}
