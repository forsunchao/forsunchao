package ThisDemo;
class Person8{
	private String name ;
	private int age;
	public Person8(){
		System.out.println("�µĶ�������ˡ�") ;
	}
	public Person8(String name){
		this() ;	// �����޲ι���
		this.name = name ;
	}
	public Person8(String name,int age){
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
public class ThisDemo05{
	public static void main(String args[]){
		Person8 per = new Person8("����",30) ;
		System.out.println(per.getName() + " --> " + per.getAge()) ;
	}
};