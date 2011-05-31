package org.sunchao.vo;
/**
 * 这里面有省的id，名字，和所拥有的学校
 * @author Sunchao
 *
 */
public class Province {
	private int pid;
	private String pName;
//	private String pSchool;

//	public String getPSchool() {
//		return pSchool;
//	}

//	public void setPSchool(String school) {
//		pSchool = school;
//	}

	public Province() {
	}

	public Province(int pid, String pName) {
		this.pid = pid;
		this.pName = pName;
//		this.pSchool = pSchool;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPName() {
		return pName;
	}

	public void setPName(String name) {
		pName = name;
	}
}
