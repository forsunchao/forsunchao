package PolDemo;
class A7{
	public void fun1(){
		System.out.println("1��A�� --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;
	}
};
class B7 extends A7{
	public void fun1(){	// ��������д��
		System.out.println("2��B�� --> public void fun1(){}") ;
	}
	public void fun3(){	// �˲���Ϊ�����Լ�����ģ������в�����
		System.out.println("3��B�� --> public void fun3(){}") ;
	}
};
class C7 extends A7{
	public void fun1(){	// ��������д��
		System.out.println("4��C�� --> public void fun1(){}") ;
	}
	public void fun4(){	// �˲���Ϊ�����Լ�����ģ������в�����
		System.out.println("5��C�� --> public void fun4(){}") ;
	}
};
public class PolDemo07{
	public static void main(String args[]){
		A7 a = new B7() ;
		System.out.println(a instanceof A7) ;
		System.out.println(a instanceof B7) ;
		System.out.println(a instanceof C7) ;
	}
};