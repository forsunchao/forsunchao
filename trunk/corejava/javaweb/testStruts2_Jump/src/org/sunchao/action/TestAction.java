package org.sunchao.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String execute() throws Exception {
		name = "sunchao";
		System.out.println("TestAction±»µ÷ÓÃ");
		return SUCCESS;
	}
	
}
