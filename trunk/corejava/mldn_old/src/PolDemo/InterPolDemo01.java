package PolDemo;
interface A10{
	public void fun() ;
}
class B10 implements A10{
	public void fun(){
		System.out.println("Hello") ;
	}
};
public class InterPolDemo01{
	public static void main(String args[]){
		A10 a = new B10() ;	// 为接口实例化
		a.fun() ;
	}
};