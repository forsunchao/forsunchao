/**
 * 这个Pol包的是Java的多态性，是Java的核心，要理解透彻
 */
package PolDemo;
class A{
	public void fun1(){
		System.out.println("1、A类 --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;
	}
};
class B extends A{
	public void fun1(){	// 将方法覆写了
		System.out.println("2、B类 --> public void fun1(){}") ;
	}
	public void fun3(){	// 此操作为子类自己定义的，父类中不存在
		System.out.println("3、B类 --> public void fun3(){}") ;
	}
};
public class PolDemo01{
	public static void main(String args[]){
		A a = new B() ;	// 发生向上转型关系，子类实例 --> 父类实例
		a.fun2() ;
	}
};