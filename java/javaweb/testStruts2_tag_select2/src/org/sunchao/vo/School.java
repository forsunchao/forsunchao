package org.sunchao.vo;

public class School {
	private int sid;
	private String sName;

	public School() {
	}

	public School(int sid, String sName) {
		this.sid = sid;
		this.sName = sName;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSName() {
		return sName;
	}

	public void setSName(String name) {
		sName = name;
	}

}
