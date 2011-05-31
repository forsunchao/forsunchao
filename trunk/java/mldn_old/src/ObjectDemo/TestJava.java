/**
 * 抢答题，分析输出结果
 */
package ObjectDemo;
abstract class A{
	public A(){
		this.print() ;
	}
	public abstract void print() ;
};
class B extends A{
	private int x = 100 ;
	public B(int x){
		this.x = x ;
	}
	public void print(){
		System.out.println("x = " + x) ;
	}
};
public class TestJava{
	public static void main(String args[]){
		A a = new B(10) ;
	}
};