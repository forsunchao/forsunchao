/**
 * ����
 */
package StaticDemo;
class Person4{
	private String name ;
	private static int count ; 
	public Person4(){
		count++ ;
		System.out.println("������" + count + "��ʵ��������") ;
	}
	public String getInfo(){
		return "������" + this.name ;
	}
};
public class StaticDemo07{
	public static void main(String args[]){
		new Person4() ;	
		new Person4() ;	
		new Person4() ;	
		new Person4() ;	
		new Person4() ;	
	}
};