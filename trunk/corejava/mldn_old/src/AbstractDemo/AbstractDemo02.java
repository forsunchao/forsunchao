package AbstractDemo;
abstract class A2{
	public abstract void fun() ;
};
class B2 extends A2{	// �̳г�����
	public void fun(){	// ��д����ʱ��Ҫע����ʿ���Ȩ��
		System.out.println("Hello World!!!") ;
	}
};
public class AbstractDemo02{
	public static void main(String args[]){
		B2 b = new B2() ;
		b.fun() ;
	}
};