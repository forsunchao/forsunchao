package org.lxh.stringbufferdemo;

public class StringBufferAPIDemo02 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer() ;
		buf.append("hello") ;
		buf.append(" ").append("world").append("!!!") ;
		buf.insert(1, "LXH") ; ;
		buf.insert(0, "MLDN") ;
		System.out.println(buf.delete(0, 9)) ;	// 将0~9的内容删除掉,9不算
	}

}
