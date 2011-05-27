package org.lxh.gendemo3;

public class GenDemo06 {
	public static void main(String[] args) {
		Info<String> info1 = new Info<String>("уехЩ") ;
		Info<Integer> info2 = new Info<Integer>(1) ;
		fun(info1) ;
		fun(info2) ;
	}
	public static void fun(Info<?> x){
		System.out.println(x.getMsg()) ;
	}
}
