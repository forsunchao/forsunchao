package ThisDemo;
class Person1{
	private String name ;
	private int age;
	public Person1(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public int getAge(){
		return this.age ;
	}
};

public class CompareDemo02{
	public static void main(String args[]){
		Person1 per1 = new Person1("张三",30) ;
		Person1 per2 = new Person1("张三",30) ;
		if(per1.getName().equals(per2.getName())&&per1.getAge()==per2.getAge()){
			System.out.println("是同一个人！") ;
		}
	}
};