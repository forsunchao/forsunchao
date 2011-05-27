package org.lxh.stringbufferdemo;

public class StringBufferDemo02 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer() ;
		buf.append("hello") ;
		buf.append(" ").append("world").append("!!!") ;
		String str = buf.toString() ;	// StringBuffer --> String
		System.out.println(str.indexOf("hello")) ;
	}

}
