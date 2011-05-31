package InterAbstract;
interface A2{
	public void fun() ;
	abstract class B2{	// 内部抽象类
		public abstract void print() ;
	}
};
class X2 implements A2{
	public void fun(){
		System.out.println("****************") ;
	}
	class Y2 extends B2{
		public void print(){
			System.out.println("===================") ;
		}
	};
};
public class TestDemo02{
	public static void main(String args[]){
		A2 a = new X2() ;
		a.fun() ;
		A2.B2 b = new X2().new Y2() ;
		b.print() ;
	}
};