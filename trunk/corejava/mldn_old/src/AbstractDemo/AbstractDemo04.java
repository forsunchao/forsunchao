package AbstractDemo;
abstract class A4{
	public A4(){	// ���췽��
		System.out.println("*************************") ;
	}
	public abstract void fun() ;
};
class B4 extends A4{	// �̳г�����
	public B4(){
		super() ;
		System.out.println("=========================") ;
	}
	public void fun(){	// ��д����ʱ��Ҫע����ʿ���Ȩ��
		System.out.println("Hello World!!!") ;
	}
};
public class AbstractDemo04{
	public static void main(String args[]){
		B4 b = new B4() ;
	}
};