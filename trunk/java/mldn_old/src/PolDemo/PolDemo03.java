package PolDemo;
class A3{
	public void fun1(){
		System.out.println("1��A�� --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;
	}
};
class B3 extends A3{
	public void fun1(){	// ��������д��
		System.out.println("2��B�� --> public void fun1(){}") ;
	}
	public void fun3(){	// �˲���Ϊ�����Լ�����ģ������в�����
		System.out.println("3��B�� --> public void fun3(){}") ;
	}
};
public class PolDemo03{
	public static void main(String args[]) {
		A3 a = new A3() ;
		B3 b = (B3)a ;//���ﲻ��ת�ͳɹ�
		b.fun2() ;
	}
};