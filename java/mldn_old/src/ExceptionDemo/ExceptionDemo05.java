package ExceptionDemo;
public class ExceptionDemo05{
	public static void main(String args[]){
		int i = 0 ;
		int j = 0 ;
		System.out.println("========== 计算开始 ===========") ;
		try{
			i = Integer.parseInt(args[0]) ;
			j = Integer.parseInt(args[1]) ;
			int temp = i / j ;
			System.out.println("计算结果：" + temp) ;
		}catch(ArithmeticException e){
			System.out.println("出现了数学异常：" + e) ;
		}catch(NumberFormatException e){
			System.out.println("输入的不是数字：" + e) ;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("输入的参数个数不对：" + e) ;
		}finally{
			System.out.println("** 不管是否有异常，我都执行。") ;
		}
		System.out.println("========== 计算结束 ===========") ;
	}
};