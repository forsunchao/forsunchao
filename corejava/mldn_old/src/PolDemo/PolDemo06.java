package PolDemo;
class A6{
	public void fun1(){
		System.out.println("1��A�� --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;
	}
};
class B6 extends A6{
	public void fun1(){	// ��������д��
		System.out.println("2��B�� --> public void fun1(){}") ;
	}
	public void fun3(){	// �˲���Ϊ�����Լ�����ģ������в�����
		System.out.println("3��B�� --> public void fun3(){}") ;
	}
};
class C6 extends A6{
	public void fun1(){	// ��������д��
		System.out.println("4��C�� --> public void fun1(){}") ;
	}
	public void fun4(){	// �˲���Ϊ�����Լ�����ģ������в�����
		System.out.println("5��C�� --> public void fun4(){}") ;
	}
};
public class PolDemo06{
	public static void main(String args[]){
		fun(new B6()) ;
		fun(new C6()) ;
	}
	public static void fun(A6 a){
		a.fun2() ;
		B6 b = (B6)a ;
		b.fun3() ;
	}
};