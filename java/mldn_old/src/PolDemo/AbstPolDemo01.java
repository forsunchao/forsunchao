package PolDemo;
abstract class A9{
	public abstract void fun() ;
};
class B9 extends A9{
	public void fun(){
		System.out.println("Hello") ;
	}
};
public class AbstPolDemo01{
	public static void main(String args[]){
		A9 a = new B9() ;
		a.fun() ;
	}
};