package AbstractDemo;
abstract class A{
	private String name ;
	public A(String name){	// ���췽��
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
	public abstract void fun() ;
};
class B extends A{	// �̳г�����
	public B(String name){
		super(name) ;
	}
	public void fun(){	// ��д����ʱ��Ҫע����ʿ���Ȩ��
		System.out.println(super.getName()) ;
	}
};
public class AbstractDemo05{
	public static void main(String args[]){
		B b = new B("MLDN") ;
		b.fun() ;
	}
};