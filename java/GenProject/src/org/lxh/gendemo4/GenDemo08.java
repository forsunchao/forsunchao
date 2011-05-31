package org.lxh.gendemo4;

public class GenDemo08 {
	public static void main(String[] args) {
		Info<Integer> info1 = new Info<Integer>(1) ;
		Info<Float> info2 = new Info<Float>(1.1f) ;
		fun(info1) ;
		fun(info2) ;
	}
	public static void fun(Info<? extends Number> x){	// 最大的类型是Number或者是其子类 
		System.out.println(x.getMsg()) ;
	}
}
