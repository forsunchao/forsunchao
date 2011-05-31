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
		//获取CollStudent类型class对象
		Class cl = cs.getClass();
		//获取CollStudent类的名称
		System.out.println(cl.getName());
		//获取CollStudent类中的所有方法名字
		Method[] methods = cl.getDeclaredMethods();
		int length = methods.length;
		for (int index = 0; index < length; index++) {
         System.out.println(methods[index].getName());
		}
		//获取CollStudent类所实现的接口的class数组
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
