package ExtDemo;
class Person8{
	private String name ;
	private int age ;
	public Person8(String name,int age){
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
class Student8 extends Person8 {
	private String school ;	// ���������
	public Student8(String name,int age,String school){
		super(name,age) ;	// ��ȷ���ø����������������Ĺ��췽��
		this.school = school ;
	}
	public void setSchool(String school){
		this.school = school ;
	}
	public String getSchool(){
		return this.school ;
	}
};
public class ExtDemo08{
	public static void main(String args[]){
		Student8 stu = new Student8("����",30,"�廪��ѧ") ;	//  ѧ��
		System.out.println("������" + stu.getName()) ;
		System.out.println("���䣺" + stu.getAge()) ;
		System.out.println("ѧУ��" + stu.getSchool()) ;
	}
};