package ThisDemo;
class Person9{
	public void print(){
		System.out.println(this) ;//this指对象本身
	}
};
public class ThisDemo06{
	public static void main(String args[]){
		Person9 per1 = new Person9() ;
		Person9 per2 = new Person9() ;
		System.out.println(per1) ;
		per1.print() ;//打印实例产生的对象本身
		System.out.println(per2) ;
		per2.print() ;
	}
};