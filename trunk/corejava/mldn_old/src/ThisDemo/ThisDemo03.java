package ThisDemo;
class Person6{
	private String name ;
	private int age;
	public Person6(){
		System.out.println("�µĶ�������ˡ�") ;
	}
	public Person6(String name){
		this.name = name ;
		System.out.println("�µĶ�������ˡ�") ;
	}
	public Person6(String name,int age){
		this.name = name ;
		this.age = age ;
		System.out.println("�µĶ�������ˡ�") ;
	}
	public void setName(String name){
		this.name = name ;
	}
	public void setAge(int age){
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public int getAge(){
		return this.age ;
	}
};
public class ThisDemo03{
	public static void main(String args[]){
		Person6 per = new Person6("����",30) ;
		System.out.println(per.getName() + " --> " + per.getAge()) ;
	}
};