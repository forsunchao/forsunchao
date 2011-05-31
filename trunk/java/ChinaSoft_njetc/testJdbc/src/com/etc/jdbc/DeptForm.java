package com.etc.jdbc;

/**
 * Dept entity.
 * 
 * @author wxy
 */

public class DeptForm extends CommonForm{

	@Override
	public String[] getPrimary() {
		// TODO Auto-generated method stub
		return null;
	}

	private Long deptid;
	private String deptname;
	private Long deptnum;
	private String deptdesc;

	public DeptForm() {
	}

	public Long getDeptid() {
		return deptid;
	}

	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Long getDeptnum() {
		return deptnum;
	}

	public void setDeptnum(Long deptnum) {
		this.deptnum = deptnum;
	}

	public String getDeptdesc() {
		return deptdesc;
	}

	public void setDeptdesc(String deptdesc) {
		this.deptdesc = deptdesc;
	}
}