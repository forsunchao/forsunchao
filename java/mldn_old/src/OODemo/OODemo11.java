package OODemo;
class Person11{
	private String name	;	// ��ʾ�˵�����
	private int age ;		// ��ʾ�˵�����
	public Person11(){		// ������һ�����췽��
		System.out.println("******************") ;
	}
	public void tell(){	// ����˵���ķ���
		System.out.println("������" + this.getName() + "�����䣺" + this.getAge()) ;
	}
	public void setName(String n){
		name = n ;
	}
	public void setAge(int a){
		if(a>=0&&a<=200){
			age = a ;
		}
	}
	public String getName(){
		return name ;
	}
	public int getAge(){
		return age ;
	}
};
public class OODemo11{
	public static void main(String args[]){
		Person11 per = null ;
		per = new Person11() ;	// ʵ��������
		/*
		
		per.setName("����") ;		// Ϊname���Ը�ֵ
		per.setAge(30);
		per.tell() ;
	*/
	}
};