package InnerClassDemo;
class Outer4{
	private String name = "HELLO WORLD!!!" ;
	public void fun(){
		class Inner4{
			public void print(){
				System.out.println("name = " + name) ;
			}
		}
		new Inner4().print() ;
	}
};
public class InnerClassDemo05{
	public static void main(String args[]){
		new Outer4().fun() ;
	}
};