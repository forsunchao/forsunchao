package ObjectDemo;
class Person6{
	private String name ;
	private int age ;
	public Person6(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String toString(){	// ��д��toString()����
 		return "������" + this.name + "�����䣺" + this.age ;
	}
};
public class ObjectDemo06{
	public static void main(String arg[]){
		System.out.println(new Person6("����",30)) ;
	}
};