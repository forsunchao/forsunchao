package InterfaceDemo;
interface A3{
	// public static final String INFO = "CHINA" ;
	String INFO = "CHINA" ;	// ȫ�ֳ���
	// public abstract void print() ;
	void print() ;	// ���󷽷�
	public void fun() ;	// ���󷽷�
}
interface C3{
	public void funA() ;
}
class B3 implements A3,C3{	// ����Bʵ���˽ӿ�A
	public void print(){	// ʵ�ֳ��󷽷�
		System.out.println("HELLO WORLD!!!") ;
	}
	public void fun(){
		System.out.println(INFO);	// ���ȫ�ֳ���
	}
	public void funA(){
		System.out.println("��Ϣ��" + INFO) ;
	}
};
public class InterfaceDemo03{
	public static void main(String args[]){
		B3 b = new B3() ;
		b.print() ;
		b.fun() ;
		b.funA() ;
	}
};