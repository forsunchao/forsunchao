package ExtDemo;
class A3{
	private void fun(){
		System.out.println("A���ж���ķ�����") ;
	}
	public void print(){
		this.fun() ;		// ����fun()����
	}
};
class B3 extends A3{
	void fun(){	// �˷���ʵ���������½���һ������
		System.out.println("B���ж���ķ�����") ;
	}
};
public class OverrideDemo03{
	public static void main(String args[]){
		B3 b = new B3() ;
		b.print() ;
	}
};