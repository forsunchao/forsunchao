package org.lxh.regextdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo02 {

	public static void main(String[] args) {
		String str = "1ss34fsdafsd567fsdafsd";// �ַ������������
		String regex = "\\d+";
		Matcher mat = Pattern.compile(regex).matcher(str);
		System.out.println(mat.replaceAll("��"));// �滻
	}

}
