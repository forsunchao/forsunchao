package net.njetc.bean;

public class Student {
	// ĞÕÃû
	private String name;
	// Ñ§ºÅ
	private int stuid;

	public Student(String name, int stuid) {
		super();
		this.name = name;
		this.stuid = stuid;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

}
