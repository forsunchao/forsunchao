package org.lxh.gendemo4;

public class GenDemo07 {
	public static void main(String[] args) {
		Info<String> info1 = new Info<String>("����") ;
		Info<Object> info2 = new Info<Object>(1) ;
		fun(info1) ;
		fun(info2) ;
	}
	public static void fun(Info<? super String> x){	// ֻ�ܽ���String���丸��
		System.out.println(x.getMsg()) ;
	}
}
