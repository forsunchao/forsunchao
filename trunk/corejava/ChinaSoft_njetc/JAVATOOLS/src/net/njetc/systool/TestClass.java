package net.njetc.systool;

import java.lang.reflect.Method;

public class TestClass {

	private String name;
	private Long id;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TestClass cs = new TestClass();
		//��ȡCollStudent����class����
		Class cl = cs.getClass();
		//��ȡCollStudent�������
		System.out.println(cl.getName());
		//��ȡCollStudent���е����з�������
		Method[] methods = cl.getDeclaredMethods();
		int length = methods.length;
		for (int index = 0; index < length; index++) {
         System.out.println(methods[index].getName());
		}
		//��ȡCollStudent����ʵ�ֵĽӿڵ�class����
		 Class []cls = cl.getInterfaces() ;
		 length=cls.length;
		 for (int index = 0; index < length; index++) {
	         System.out.println(cls[index].getName());
			}
	}
	 
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
