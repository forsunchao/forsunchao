package org.lxh.regextdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo01 {

	public static void main(String[] args) {
		String str = "1234567";// �ַ������������
		String regex = "\\d+" ;
		Matcher mat = Pattern.compile(regex).matcher(str) ; 
		if(mat.matches()){	// ִ����֤
			System.out.println("�ַ�����������ɣ�") ;
		}else{
			System.out.println("�ַ����ɷ�������ɣ�") ;
		}
	}

}
