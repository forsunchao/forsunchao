package com.chinasoft.sms.check.action;
import java.util.LinkedList;
import java.util.List;

public class StaffFlowInfo {
	private String nub;
	private String name;
	private String position;
	private String id;
	private String startdate;
	private String enddate;
	private List<String> checkNameList;

	public StaffFlowInfo() {
       checkNameList = new LinkedList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public List<String> getCheckNameList() {
		return checkNameList;
	}

	public void setCheckNameList(List<String> checkNameList) {
		this.checkNameList = checkNameList;
	}

	public String getNub() {
		return nub;
	}

	public void setNub(String nub) {
		this.nub = nub;
	}

}
