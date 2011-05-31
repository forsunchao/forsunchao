package ExceptionDemo;
class Math{
	public int div(int i,int j) throws Exception{
		return i / j ;
	}
};
public class ExceptionDemo08{
	public static void main(String args[]){
		Math m = new Math() ;
		try{
			int temp = m.div(10,0) ;
			System.out.println(temp) ;
		}catch(Exception e){
			e.printStackTrace() ;	// ¥Ú”°“Ï≥£
		}
	}
};