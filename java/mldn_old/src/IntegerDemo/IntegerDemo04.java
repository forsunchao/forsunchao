package IntegerDemo;
public class IntegerDemo04{
	public static void main(String args[]){
		String str = "12sss3" ;	// 字符串由数字组成
		int i = Integer.parseInt(str) ;	// 将字符串变为int型
		System.out.println(i++) ;
	}
};