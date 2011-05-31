package AbstractDemo;
abstract class A{
	private String name ;
	public A(String name){	// 构造方法
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
	public abstract void fun() ;
};
class B extends A{	// 继承抽象类
	public B(String name){
		super(name) ;
	}
	public void fun(){	// 覆写方法时需要注意访问控制权限
		System.out.println(super.getName()) ;
	}
};
public class AbstractDemo05{
	public static void main(String args[]){
		B b = new B("MLDN") ;
		b.fun() ;
	}
};