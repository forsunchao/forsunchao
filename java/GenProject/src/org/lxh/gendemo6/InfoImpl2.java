package org.lxh.gendemo6;

public class InfoImpl2 implements Info<InfoImpl2> {

	public void fun(InfoImpl2 param) {
		System.out.println(param);
	}
	public String toString(){
		return "hello" ;
	}
}
