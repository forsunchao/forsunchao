package InterfaceDemo;
interface A5{
	public void printA() ;
}
interface B5{
	public void printB() ;
}
abstract class C5 implements A5,B5{
	public abstract void printC() ;
};
class X5 extends C5{
	public void printA(){}
	public void printB(){}
	public void printC(){}
};
public class InterfaceDemo05{
	public static void main(String args[]){
//		B5 b = new B5() ;
//		b.printB() ;
	}
};