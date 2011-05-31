/**
 * 计数
 */
package StaticDemo;
class Person4{
	private String name ;
	private static int count ; 
	public Person4(){
		count++ ;
		System.out.println("产生了" + count + "个实例化对象。") ;
	}
	public String getInfo(){
		return "姓名：" + this.name ;
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