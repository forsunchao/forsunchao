package CodeDemo;
class Demo1{
	{	// �����
		System.out.println("*********** ����� *************") ;
	}
	static{
		System.out.println("*********** ���еľ�̬�� *************") ;
	}
	public Demo1(){	// ���췽��
		System.out.println("*********** ���췽�� *************") ;
	}
};
public class CodeDemo03{
	static{
		System.out.println("*********** �����еľ�̬�� *************") ;
	}
	public static void main(String args[]){
		new Demo1() ;
		new Demo1() ;
		new Demo1() ;
	}
};