package PolDemo;
class A4{
	public void fun1(){
		System.out.println("1��A�� --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;
	}
};
class B4 extends A4{
	public void fun1(){	// ��������д��
		System.out.println("2��B�� --> public void fun1(){}") ;
	}
	public void fun3(){	// �˲���Ϊ�����Լ�����ģ������в�����
		System.out.println("3��B�� --> public void fun3(){}") ;
	}
};
class C4 extends A4{
	public void fun1(){	// ��������д��
		System.out.println("4��C�� --> public void fun1(){}") ;
	}
	public void fun4(){	// �˲���Ϊ�����Լ�����ģ������в�����
		System.out.println("5��C�� --> public void fun4(){}") ;
	}
};
public class PolDemo04{
	public static void main(String args[]){
		fun(new B4()) ;
		fun(new C4()) ;
	}
	public static void fun(B4 b){
		b.fun2() ;
		b.fun3() ;
	}
	public static void fun(C4 c){
		c.fun2() ;
		c.fun4() ;
	}
};