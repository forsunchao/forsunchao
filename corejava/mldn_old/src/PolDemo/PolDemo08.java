package PolDemo;
class A8{
	public void fun1(){
		System.out.println("1��A�� --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;
	}
};
class B8 extends A8{
	public void fun1(){	// ��������д��
		System.out.println("2��B�� --> public void fun1(){}") ;
	}
	public void fun3(){	// �˲���Ϊ�����Լ�����ģ������в�����
		System.out.println("3��B�� --> public void fun3(){}") ;
	}
};
class C8 extends A8{
	public void fun1(){	// ��������д��
		System.out.println("4��C�� --> public void fun1(){}") ;
	}
	public void fun4(){	// �˲���Ϊ�����Լ�����ģ������в�����
		System.out.println("5��C�� --> public void fun4(){}") ;
	}
};
public class PolDemo08{
	public static void main(String args[]){
		fun(new B8()) ;
		fun(new C8()) ;
	}
	public static void fun(A8 a){
		a.fun2() ;
		if(a instanceof B8){
			B8 b = (B8)a ;
			b.fun3() ;
		}
		if(a instanceof C8){
			C8 c = (C8)a ;
			c.fun4() ;
		}
	}
};