package ObjectDemo;
class Person7{
	private String name ;
	private int age ;
	public boolean equals(Object obj){	// 是完成对象的比较操作
		if(this==obj){	// 两个地址相等
			return true ;
		}
		if(!(obj instanceof Person7)){	// 不是同一个类型
			return false ;
		}
		Person7 per = (Person7)obj ;
		if(this.name.equals(per.name)&&this.age==per.age){
			return true ;
		}else{
			return false ;
		}
	}
	public Person7(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String toString(){	// 覆写了toString()方法
 		return "姓名：" + this.name + "，年龄：" + this.age ;
	}
};
public class ObjectDemo07{
	public static void main(String arg[]){
		System.out.println(new Person7("张三",30).equals("hello")) ;
	}
};