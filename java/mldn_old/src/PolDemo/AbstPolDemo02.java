package PolDemo;
abstract class Person{
	private String name ;
	private int age ;
	public Person(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public int getAge(){
		return this.age ;
	}
	public void say(){
		System.out.println(this.getContent()) ;	
	}
	public abstract String getContent() ;
};
class Student extends Person{
	private float score ;
	public Student(String name,int age,float score){
		super(name,age) ;
		this.score = score ;
	}
	public String getContent(){
		return "ѧ��˵ --> ������" + super.getName()
			+ "�����䣺" + super.getName()
			+ "���ɼ���" + this.score ;
	}
};
class Worker extends Person{
	private float salary ;
	public Worker(String name,int age,float salary){
		super(name,age) ;
		this.salary = salary ;
	}
	public String getContent(){
		return "����˵ --> ������" + super.getName()
			+ "�����䣺" + super.getName()
			+ "�����ʣ�" + this.salary ;
	}
};
public class AbstPolDemo02{
	public static void main(String args[]){
		Person per1 = new Student("����",20,89.0f) ;
		Person per2 = new Worker("����",30,1189.0f) ;
		per1.say() ;
		per2.say() ;
	}
};