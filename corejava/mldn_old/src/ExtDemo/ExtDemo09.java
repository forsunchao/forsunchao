package ExtDemo;
class Person9{
	private String name ;
	private int age ;
	public Person9(String name,int age){
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
class Student9 extends Person9 {
	private String school ;	// ���������
	public Student9(String name,int age,String school){
		this(name,age) ;	// ��ȷ���ø����������������Ĺ��췽��
		this.school = school ;
	}
	public Student9(String name,int age){
		super(name,age) ;
	}
	public void setSchool(String school){
		this.school = school ;
	}
	public String getSchool(){
		return this.school ;
	}
};
public class ExtDemo09{
	public static void main(String args[]){
		Student9 stu = new Student9("����",30,"�廪��ѧ") ;	//  ѧ��
		System.out.println("������" + stu.getName()) ;
		System.out.println("���䣺" + stu.getAge()) ;
		System.out.println("ѧУ��" + stu.getSchool()) ;
	}
};