/**
 * �����Զ�����
 */
package StaticDemo;
class Person5{
	private String name ;
	private static int count ; 
	public Person5(){
		count++ ;
		this.name = "NONAME - " + count ;	// �Զ�����
	}
	public Person5(String name){
		this.name = name ;
	}
	public String getInfo(){
		return "������" + this.name ;
	}
};
public class StaticDemo08{
	public static void main(String args[]){
		System.out.println(new Person5().getInfo()) ;
		System.out.println(new Person5("A").getInfo()) ;
		System.out.println(new Person5("B").getInfo()) ;
		System.out.println(new Person5().getInfo()) ;
	}
};