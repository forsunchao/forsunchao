package org.lxh.regextdemo;

public class RegexDemo01 {

	public static void main(String[] args) {
		String str = "121s34123414123";
		char c[] = str.toCharArray(); // ���ַ�����Ϊ�ַ�����
		boolean flag = true;
		for (int i = 0; i < c.length; i++) {
			if (!(c[i] >= '0' && c[i] <= '9')) {// ��������
				flag = false;
				break ;
			}
		}
		if(flag){
			System.out.println("�ַ�������������ɣ�");
		}else{
			System.out.println("�ַ���������������ɣ�") ;
		}
	}
}
