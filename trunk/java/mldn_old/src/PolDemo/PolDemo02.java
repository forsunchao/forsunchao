package PolDemo;
class A2{
	public void fun1(){
		System.out.println("1��A�� --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;
	}
};
class B2 extends A2{
	public void fun1(){	// ��������д��
		System.out.println("2��B�� --> public void fun1(){}") ;
	}
	public void fun3(){	// �˲���Ϊ�����Լ�����ģ������в�����
		System.out.println("3��B�� --> public void fun3(){}") ;
	}
};
public class PolDemo02{
	public static void main(String args[]){
		A2 a = new B2() ;	// ��������ת�͹�ϵ������ʵ�� --> ����ʵ��
		B2 b = (B2)a ;	// ��������ת�͹�ϵ��ǿ��
		b.fun3() ;
		b.fun2() ;
	}
};