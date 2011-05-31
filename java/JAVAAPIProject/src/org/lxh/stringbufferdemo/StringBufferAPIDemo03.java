package org.lxh.stringbufferdemo;

public class StringBufferAPIDemo03 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer() ;
		buf.append("hello") ;
		buf.append(" ").append("world").append("!!!") ;
		System.out.println(buf.reverse()) ;	// 将内容反转
	}

}
