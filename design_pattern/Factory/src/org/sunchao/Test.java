package org.sunchao;


public class Test {
	public static void main(String[] args) {
		IWorkFactory studentFactory = new StudentWorkFactory();
		studentFactory.getWork().doWork();
		IWorkFactory teacherFactory = new TeacherWorkFactory();
		teacherFactory.getWork().doWork();
	}
}
