package StaticDemo;
class Person3{
	private String name ;
	private int age;
	private static String city = "A��" ;
	public static void setCity(String c){
		city = c ;
//		this.name = "����" ;
//		this.getInfo() ;
	}
	public Person3(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String getInfo(){
		return "������" + this.name + "�����䣺" + this.age + "�����У�" + city ;
	}
};
public class StaticDemo04{
	public static void main(String args[]){
		Person3 per1 = new Person3("����",30) ;
		Person3 per2 = new Person3("����",31) ;
		Person3 per3 = new Person3("����",30) ;
		System.out.println("============= ��Ϣ�޸�֮ǰ ================") ;
		System.out.println(per1.getInfo()) ;
		System.out.println(per2.getInfo()) ;
		System.out.println(per3.getInfo()) ;
		System.out.println("============= ��Ϣ�޸�֮�� ================") ;
		Person3.setCity("B��") ;
		System.out.println(per1.getInfo()) ;
		System.out.println(per2.getInfo()) ;
		System.out.println(per3.getInfo()) ;
	}
};