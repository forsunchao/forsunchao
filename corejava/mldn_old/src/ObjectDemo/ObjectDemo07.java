package ObjectDemo;
class Person7{
	private String name ;
	private int age ;
	public boolean equals(Object obj){	// ����ɶ���ıȽϲ���
		if(this==obj){	// ������ַ���
			return true ;
		}
		if(!(obj instanceof Person7)){	// ����ͬһ������
			return false ;
		}
		Person7 per = (Person7)obj ;
		if(this.name.equals(per.name)&&this.age==per.age){
			return true ;
		}else{
			return false ;
		}
	}
	public Person7(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String toString(){	// ��д��toString()����
 		return "������" + this.name + "�����䣺" + this.age ;
	}
};
public class ObjectDemo07{
	public static void main(String arg[]){
		System.out.println(new Person7("����",30).equals("hello")) ;
	}
};