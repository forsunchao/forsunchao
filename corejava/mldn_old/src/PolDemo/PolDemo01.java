/**
 * ���Pol������Java�Ķ�̬�ԣ���Java�ĺ��ģ�Ҫ���͸��
 */
package PolDemo;
class A{
	public void fun1(){
		System.out.println("1��A�� --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;
	}
};
class B extends A{
	public void fun1(){	// ��������д��
		System.out.println("2��B�� --> public void fun1(){}") ;
	}
	public void fun3(){	// �˲���Ϊ�����Լ�����ģ������в�����
		System.out.println("3��B�� --> public void fun3(){}") ;
	}
};
public class PolDemo01{
	public static void main(String args[]){
		A a = new B() ;	// ��������ת�͹�ϵ������ʵ�� --> ����ʵ��
		a.fun2() ;
	}
};