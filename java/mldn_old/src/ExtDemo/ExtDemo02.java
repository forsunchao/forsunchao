package ExtDemo;
class Person2{
	private String name ;
	private int age ;
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
class Student2 extends Person2 {
};
public class ExtDemo02{
	public static void main(String args[]){
		Student2 stu = new Student2() ;	//  ѧ��
		stu.setName("����") ;	// ��Person�̳ж���
		stu.setAge(30) ;		// ��Person�̳ж���
		System.out.println("������" + stu.getName()) ;
		System.out.println("���䣺" + stu.getAge()) ;
	}
};