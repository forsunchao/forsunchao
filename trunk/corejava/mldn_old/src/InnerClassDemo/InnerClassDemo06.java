package InnerClassDemo;
class Outer5{
	private String name = "HELLO WORLD!!!" ;
	public void fun(final int temp){
		class Inner5{
			public void print(){
				System.out.println("temp = " + temp) ;
				System.out.println("name = " + name) ;
			}
		}
		new Inner5().print() ;
	}
};
public class InnerClassDemo06{
	public static void main(String args[]){
		new Outer5().fun(30) ;
	}
};