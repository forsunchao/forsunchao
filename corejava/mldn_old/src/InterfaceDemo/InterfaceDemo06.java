package InterfaceDemo;
interface A6{
	public void printA() ;
}
interface B6{
	public void printB() ;
}
interface Z6 extends A6,B6{	// X�ӿ�ͬʱ�̳���A��B�����ӿ�
	public void printZ() ;
}
abstract class C6{
	public abstract void printC() ;
};
class X6 extends C6 implements Z6{
	public void printA(){}
	public void printB(){}
	public void printC(){}
	public void printZ(){}
};
public class InterfaceDemo06{
	public static void main(String args[]){
//		B6 b = new B6() ;
//		b.printB() ;
	}
};