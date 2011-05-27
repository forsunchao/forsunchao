package org.lxh.stringbufferdemo;

public class StringBufferAPIDemo01 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer() ;
		buf.append("hello") ;
		buf.append(" ").append("world").append("!!!") ;
		System.out.println(buf);
		buf.insert(1, "LXH") ; 
		System.out.println(buf);
		buf.insert(0, "MLDN") ;
		System.out.println(buf) ;
	}

}
