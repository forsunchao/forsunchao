package AbstractDemo;
abstract class A2{
	public abstract void fun() ;
};
class B2 extends A2{	// 继承抽象类
	public void fun(){	// 覆写方法时需要注意访问控制权限
		System.out.println("Hello World!!!") ;
	}
};
public class AbstractDemo02{
	public static void main(String args[]){
		B2 b = new B2() ;
		b.fun() ;
	}
};