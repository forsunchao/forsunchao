package ExceptionDemo;
class MyException extends Exception{	// 自定义异常
	public MyException(String msg){
		super(msg) ;
	}
};
public class ExceptionDemo13{
	public static void main(String args[]){
		try{
			throw  new MyException("自定义异常。") ;
		}catch(Exception e){
			e.printStackTrace() ;
		}
	}
};