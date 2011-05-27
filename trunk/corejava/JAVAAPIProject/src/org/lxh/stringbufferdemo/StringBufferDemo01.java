package org.lxh.stringbufferdemo;

public class StringBufferDemo01 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer() ;
		buf.append("hello") ;
		buf.append(" ").append("world").append("!!!") ;
		System.out.println(buf) ;
	}

}
