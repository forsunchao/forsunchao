package org.sunchao.vo;

public class Student {
	private String name;
	private String school;
	private int age;
	
	public Student() {};
	public Student(String name,String school,int age) {
		this.name = name;
		this.school = school;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
