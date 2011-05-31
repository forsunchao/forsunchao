package InnerClassDemo;
class Outer1{
	private String name = "HELLO WORLD!!!" ;
	public void fun(){
		new Inner1(this).print() ;	// ¥Ú”°–≈œ¢
	};
	public String getName(){
		return this.name ;
	}
};
class Inner1{
	private Outer1 out ;
	public Inner1(Outer1 out){
		this.out = out ;
	}
	public void print(){
		System.out.println("name = " + this.out.getName()) ;
	}
};
public class InnerClassDemo02{
	public static void main(String args[]){
		new Outer1().fun() ;
	}
};