package ThisDemo;
class Person7{
	private String name ;
	private int age;
	public Person7(){
		System.out.println("�µĶ�������ˡ�") ;
	}
	public Person7(String name){
		this() ;	// �����޲ι���
		this.name = name ;
	}
	public Person7(String name,int age){
		this(name) ;	// ������һ�������Ĺ��췽��
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
public class ThisDemo04{
	public static void main(String args[]){
		Person7 per = new Person7("����",30) ;
		System.out.println(per.getName() + " --> " + per.getAge()) ;
	}
};