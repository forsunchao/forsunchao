package StaticDemo;
class Person2{
	private String name ;
	private int age;
	private static String city = "A��" ;
	public static void setCity(String c){
		city = c ;
	}
	public Person2(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String getInfo(){
		return "������" + this.name + "�����䣺" + this.age + "�����У�" + city ;
	}
};
public class StaticDemo03{
	public static void main(String args[]){
		Person2 per1 = new Person2("����",30) ;
		Person2 per2 = new Person2("����",31) ;
		Person2 per3 = new Person2("����",30) ;
		System.out.println("============= ��Ϣ�޸�֮ǰ ================") ;
		System.out.println(per1.getInfo()) ;
		System.out.println(per2.getInfo()) ;
		System.out.println(per3.getInfo()) ;
		System.out.println("============= ��Ϣ�޸�֮�� ================") ;
		Person2.setCity("B��") ;
		System.out.println(per1.getInfo()) ;
		System.out.println(per2.getInfo()) ;
		System.out.println(per3.getInfo()) ;
	}
};