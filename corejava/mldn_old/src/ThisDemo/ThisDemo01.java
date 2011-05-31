package ThisDemo;
class Person4{
	private String name ;
	private int age;
	public Person4(String name,int age){
		name = name ;
		age = age ;
	}
	public void setName(String n){
		name = n ;
	}
	public void setAge(int a){
		age = a ;
	}
	public String getName(){
		return name ;
	}
	public int getAge(){
		return age ;
	}
};
public class ThisDemo01{
	public static void main(String args[]){
		Person4 per = new Person4("ÕÅÈı",30) ;
		System.out.println(per.getName() + " --> " + per.getAge()) ;
	}
};