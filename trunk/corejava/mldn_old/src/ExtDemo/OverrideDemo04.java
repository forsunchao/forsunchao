package ExtDemo;
class A4{
	public void fun(){
		System.out.println("A���ж���ķ�����") ;
	}
};
class B4 extends A4 {
	public void fun(){	// �˷���ʵ���������½���һ������
		super.fun() ;	// ���ø����е�fun()����
		System.out.println("B���ж���ķ�����") ;
	}
};
public class OverrideDemo04{
	public static void main(String args[]){
		B4 b = new B4() ;
		b.fun() ;
	}
};