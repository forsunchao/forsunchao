/**
 * 匿名内部类 框架spring和图形界面编程用的比较多
 *
 */
package InnerClassDemo;
interface A2{
	public void fun() ;
}
class X2{
	public void fun1(A2 a){
		a.fun() ;
	}
	public void fun2(){
		this.fun1(new A2(){
			public void fun(){
				System.out.println("Hello World!!!") ;
			}
		}) ;
	}
};
public class NonameDemo02{
	public static void main(String args[]){
		new X2().fun2() ;
	}
};