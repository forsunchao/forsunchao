package InnerClassDemo;
class Outer3{
	private static String name = "HELLO WORLD!!!" ;
	static class Inner3{
		public void print(){
			System.out.println("name = " + name) ;
		}
	};
};
public class InnerClassDemo04{
	public static void main(String args[]){
		Outer3.Inner3 in = new Outer3.Inner3() ;	// 实例化内部类对象
		in.print() ;
	}
};