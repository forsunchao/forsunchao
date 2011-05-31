package InnerClassDemo;
class Outer2{
	private String name = "HELLO WORLD!!!" ;
	class Inner2{
		public void print(){
			System.out.println("name = " + name) ;
		}
	};
};
public class InnerClassDemo03{
	public static void main(String args[]){
		Outer2.Inner2 in = new Outer2().new Inner2() ;	// 实例化内部类对象
		in.print() ;
	}
};