package ObjectArrayDemo;
class Person1{
	private String name ;
	private int age;
	public Person1(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String getInfo(){
		return "������" + this.name + "�����䣺" + this.age ;
	}
};

public class ObjectArrayDemo02{
	public static void main(String args[]){
		Person1 p[] = {new Person1("����",30),new Person1("����",31),new Person1("����",32)} ;
		for(int x=0;x<p.length;x++){
			System.out.println(p[x].getInfo()) ;
		}
	}
};