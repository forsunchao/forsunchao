package net.njetc.colltool.list;

import java.util.Stack;

public class TestStack {

	/**
	 * Stack
	 */
	public static void main(String[] args) {
		Stack<String> strSta=new Stack<String>();
		strSta.push("nanjing");
		strSta.push("shanghai");
		strSta.push("beijing");
		strSta.push(null);
		strSta.push("guangdong");
		System.out.println(strSta.size());
		//�鿴ջ����������Ƴ�����
		System.out.println(strSta.peek());
		System.out.println(strSta.size());
		//�Ƴ�ջ��������Ϊ�˺�����ֵ���ظö���
		System.out.println(strSta.pop());
		System.out.println(strSta.size());
	}

}
