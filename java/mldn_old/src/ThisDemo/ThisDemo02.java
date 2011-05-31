package ThisDemo;
class Person5{
	private String name ;
	private int age;
	public Person5(String name,int age){
		this.name = name ;
		this.age = age ;
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
public class ThisDemo02{
	public static void main(String args[]){
		Person5 per = new Person5("ÕÅÈı",30) ;
		System.out.println(per.getName() + " --> " + per.getAge()) ;
	}
};