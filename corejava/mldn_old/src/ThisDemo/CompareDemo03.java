/**
 * 这个程序是this关键字的难点，要特别注意
 */
package ThisDemo;
class Person2{
	private String name ;
	private int age;
	public Person2(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public boolean compare(Person2 per){
		if(this==per){	// 地址相等，指传进来的对象跟本对象相等
			return true ;
		}
		if(this.name.equals(per.name)&&this.age==per.age){
			return true ;
		}else{
			return false ;
		}
	}
	public String getName(){
		return this.name ;
	}
	public int getAge(){
		return this.age ;
	}
};

public class CompareDemo03{
	public static void main(String args[]){
		Person2 per1 = new Person2("张三",30) ;
		Person2 per2 = new Person2("张三",30) ;
		if(per1.compare(per2)){
			System.out.println("是同一个人！") ;
		}
	}
};