package org.lxh.stringbufferdemo;

public class StringBufferDemo03 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		fun(buf); // ��������
		for (int i = 0; i < 1000; i++) {
			buf.append(i).append(" ") ;	// �޸�1000������
		}
		System.out.println(buf);
	}

	public static void fun(StringBuffer b) {
		b.append("hello world!!!").append("\n");
	}
}
