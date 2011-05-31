package StringDemo;
class Demo1{
	String x = "mldn" ;
};
public class RefDemo03{
	public static void main(String args[]){
		Demo1 d = new Demo1() ;	
		d.x = "hello" ;
		fun(d) ;
		System.out.println(d.x) ;
	}
	public static void fun(Demo1 temp){
		temp.x = "world" ;
	}
};
