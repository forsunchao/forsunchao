package ExceptionDemo;
public class ExceptionDemo02{
	public static void main(String args[]){
		int i = 10 ;
		int j = 0 ;
		System.out.println("========== 计算开始 ===========") ;
		try{
			int temp = i / j ;
			System.out.println("计算结果：" + temp) ;
		}catch(ArithmeticException e){
			System.out.println("出现了数学异常：" + e) ;
		}
		System.out.println("========== 计算结束 ===========") ;
	}
};