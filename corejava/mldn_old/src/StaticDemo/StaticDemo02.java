package StaticDemo;
class Person1{
	private String name ;
	private int age;
	static String city = "A城" ;
	public Person1(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String getInfo(){
		return "姓名：" + this.name + "，年龄：" + this.age + "，城市：" + city ;
	}
};
public class StaticDemo02{
	public static void main(String args[]){
		Person1 per1 = new Person1("张三",30) ;
		Person1 per2 = new Person1("李四",31) ;
		Person1 per3 = new Person1("王五",30) ;
		System.out.println("============= 信息修改之前 ================") ;
		System.out.println(per1.getInfo()) ;
		System.out.println(per2.getInfo()) ;
		System.out.println(per3.getInfo()) ;
		System.out.println("============= 信息修改之后 ================") ;
		Person1.city = "B城" ;
		System.out.println(per1.getInfo()) ;
		System.out.println(per2.getInfo()) ;
		System.out.println(per3.getInfo()) ;
	}
};