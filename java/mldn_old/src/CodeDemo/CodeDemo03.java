package CodeDemo;
class Demo1{
	{	// 构造块
		System.out.println("*********** 构造块 *************") ;
	}
	static{
		System.out.println("*********** 类中的静态块 *************") ;
	}
	public Demo1(){	// 构造方法
		System.out.println("*********** 构造方法 *************") ;
	}
};
public class CodeDemo03{
	static{
		System.out.println("*********** 主类中的静态块 *************") ;
	}
	public static void main(String args[]){
		new Demo1() ;
		new Demo1() ;
		new Demo1() ;
	}
};