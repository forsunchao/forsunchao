package org.lxh.gendemo4;

public class GenDemo10 {
	public static void main(String[] args) {
		Info<Object> info1 = new Info<Object>(1) ;	// 没有指定泛型类型
		Info<Object> info2 = new Info<Object>("1") ;	// 没有指定泛型类型
	}
}
