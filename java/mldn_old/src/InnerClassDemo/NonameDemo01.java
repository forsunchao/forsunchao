/**
 * �����ڲ��� ���spring��ͼ�ν������õıȽ϶�
 *
 */
package InnerClassDemo;
interface A{
	public void fun() ;
}
class B implements A{
	public void fun(){
		System.out.println("Hello World!!!") ;
	}
};
class X{
	public void fun1(A a){
		a.fun() ;
	}
	public void fun2(){
		this.fun1(new B()) ;//����Bʹ��һ�Σ����Կ�����Ƴ������ڲ���
	}
};
public class NonameDemo01{
	public static void main(String args[]){
		new X().fun2() ;
	}
};