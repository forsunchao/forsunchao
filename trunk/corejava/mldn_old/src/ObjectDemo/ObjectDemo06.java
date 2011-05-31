package ObjectDemo;
class Person6{
	private String name ;
	private int age ;
	public Person6(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String toString(){	// 覆写了toString()方法
 		return "姓名：" + this.name + "，年龄：" + this.age ;
	}
};
public class ObjectDemo06{
	public static void main(String arg[]){
		System.out.println(new Person6("张三",30)) ;
	}
};