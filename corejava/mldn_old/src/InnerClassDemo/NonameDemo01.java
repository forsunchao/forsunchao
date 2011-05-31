/**
 * 匿名内部类 框架spring和图形界面编程用的比较多
 *
 */
package InnerClassDemo;
interface A{
	public void fun() ;
}
class B implements A{
	public void fun(){
		System.out.println("Hello World!!!") ;
	}
};
class X{
	public void fun1(A a){
		a.fun() ;
	}
	public void fun2(){
		this.fun1(new B()) ;//这里B使用一次，可以考虑设计成匿名内部类
	}
};
public class NonameDemo01{
	public static void main(String args[]){
		new X().fun2() ;
	}
};