package org.sunchao;

public class TeacherWorkFactory implements IWorkFactory {

	@Override
	public IWork getWork() {
		return new TeacherWork();
	}

}
