package ExtDemo;
class A1{
	public void fun(){
		System.out.println("A���ж���ķ�����") ;
	}
};
class B1 extends A1 {
	public void fun(){	// ��Ϊ������д
		System.out.println("B���ж���ķ�����") ;
	}
};
public class OverrideDemo01{
	public static void main(String args[]){
		B1 b = new B1() ;
		b.fun() ;
	}
};