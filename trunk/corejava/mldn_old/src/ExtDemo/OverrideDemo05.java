package ExtDemo;
class A5{
	public String name = "HELLO" ;
};
class B5 extends A5 {
	public int name = 1 ;	// 此时属性覆盖了
	public void print(){
		System.out.println("name = " + name) ;
	}
};
public class OverrideDemo05{
	public static void main(String args[]){
		B5 b = new B5() ;
		b.print() ;
	}
};