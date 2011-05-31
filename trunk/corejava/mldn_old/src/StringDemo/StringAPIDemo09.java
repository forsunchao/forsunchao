package StringDemo;
public class StringAPIDemo09{
	public static void main(String args[]){
		String str = "hello world" ;
		System.out.println(str.indexOf("hello")) ;
		System.out.println(str.indexOf("mldn")) ;
		if(str.indexOf("mldn")!=-1){
			System.out.println("查找到了所需要的内容。") ;
		}
	}
};
