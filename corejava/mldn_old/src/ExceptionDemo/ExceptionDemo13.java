package ExceptionDemo;
class MyException extends Exception{	// �Զ����쳣
	public MyException(String msg){
		super(msg) ;
	}
};
public class ExceptionDemo13{
	public static void main(String args[]){
		try{
			throw  new MyException("�Զ����쳣��") ;
		}catch(Exception e){
			e.printStackTrace() ;
		}
	}
};