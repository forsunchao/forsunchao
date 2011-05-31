package ExceptionDemo;
public class ExceptionDemo10{
	public static void main(String args[]){
		try{
			throw new Exception("抛着玩的。") ;	// 人为抛出
		}catch(Exception e){
			System.out.println(e) ;
		}
	}
};