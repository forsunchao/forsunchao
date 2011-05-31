package ExceptionDemo;
class Math2{
	public int div(int i,int j) throws Exception{
		return i / j ;
	}
};
public class ExceptionDemo09{
	public static void main(String args[]) throws Exception {
		Math2 m = new Math2() ;
		int temp = m.div(10,0) ;
		System.out.println(temp) ;
	}
};