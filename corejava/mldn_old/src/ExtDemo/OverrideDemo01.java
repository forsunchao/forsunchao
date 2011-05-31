package ExtDemo;
class A1{
	public void fun(){
		System.out.println("A类中定义的方法。") ;
	}
};
class B1 extends A1 {
	public void fun(){	// 称为方法覆写
		System.out.println("B类中定义的方法。") ;
	}
};
public class OverrideDemo01{
	public static void main(String args[]){
		B1 b = new B1() ;
		b.fun() ;
	}
};