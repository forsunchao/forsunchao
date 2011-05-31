//内部类的好处就是可以访问外部类的私有属性
package InnerClassDemo;
class Outer{
	private String name = "HELLO WORLD!!!" ;
	class Inner{
		public void print(){
			System.out.println("name = " + name) ;
		}
	};
	public void fun(){
		new Inner().print() ;	// 打印信息
	};
};
public class InnerClassDemo01{
	public static void main(String args[]){
		new Outer().fun() ;
	}
};