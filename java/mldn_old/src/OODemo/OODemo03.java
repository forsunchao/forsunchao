package OODemo;
class Person3{
	String name	;	// ��ʾ�˵�����
	int age ;		// ��ʾ�˵�����
	public void tell(){	// ����˵���ķ���
		System.out.println("������" + name + "�����䣺" + age) ;
	}
};
public class OODemo03{
	public static void main(String args[]){
		Person3 per = new Person3() ;	// ����ʵ��������
		per.name = "����" ;		// Ϊ���ָ�ֵ
		per.age = 30 ;			// Ϊ���丳ֵ
		per.tell() ;			// ���÷���
	}
};