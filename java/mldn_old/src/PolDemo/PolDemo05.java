package PolDemo;
class A5{
	public void fun1(){
		System.out.println("1��A�� --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;
	}
};
class B5 extends A5{
	public void fun1(){	// ��������д��
		System.out.println("2��B�� --> public void fun1(){}") ;
	}
	public void fun3(){	// �˲���Ϊ�����Լ�����ģ������в�����
		System.out.println("3��B�� --> public void fun3(){}") ;
	}
};
class C5 extends A5{
	public void fun1(){	// ��������д��
		System.out.println("4��C�� --> public void fun1(){}") ;
	}
	public void fun4(){	// �˲���Ϊ�����Լ�����ģ������в�����
		System.out.println("5��C�� --> public void fun4(){}") ;
	}
};
public class PolDemo05{
	public static void main(String args[]){
		fun(new B5()) ;
		fun(new C5()) ;
	}
	public static void fun(A5 a){
		a.fun2() ;
	}
};