package OODemo;
class Person12{
	private String name	;	// ��ʾ�˵�����
	private int age ;		// ��ʾ�˵�����
	public Person12(){}
	public Person12(String n){
		this.setName(n) ;
	}
	public Person12(String n,int a){		// ������һ�����췽��
		this.setName(n) ;	// ����setName()����
		this.setAge(a) ;		// ����setAge()����
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
public class OODemo12{
	public static void main(String args[]){
		Person12 per = null ;
		per = new Person12("����",-30) ;	// ʵ��������
		per.tell() ;
	}
};