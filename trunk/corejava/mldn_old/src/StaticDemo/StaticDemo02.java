package StaticDemo;
class Person1{
	private String name ;
	private int age;
	static String city = "A��" ;
	public Person1(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String getInfo(){
		return "������" + this.name + "�����䣺" + this.age + "�����У�" + city ;
	}
};
public class StaticDemo02{
	public static void main(String args[]){
		Person1 per1 = new Person1("����",30) ;
		Person1 per2 = new Person1("����",31) ;
		Person1 per3 = new Person1("����",30) ;
		System.out.println("============= ��Ϣ�޸�֮ǰ ================") ;
		System.out.println(per1.getInfo()) ;
		System.out.println(per2.getInfo()) ;
		System.out.println(per3.getInfo()) ;
		System.out.println("============= ��Ϣ�޸�֮�� ================") ;
		Person1.city = "B��" ;
		System.out.println(per1.getInfo()) ;
		System.out.println(per2.getInfo()) ;
		System.out.println(per3.getInfo()) ;
	}
};