package StringDemo;
public class StringAPIDemo07{
	public static void main(String args[]){
		String str = "hello world" ;
		String s[] = str.split(" ") ;	// ���տո���
		for(String st:s){
			System.out.println(st) ;
		}
	}
};
