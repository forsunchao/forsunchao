package org.sunchao.action;

import com.opensymphony.xwork2.ActionSupport;

public class Test1Action extends ActionSupport {

	public String execute() throws Exception {
		System.out.println("Test1Action������");
		return SUCCESS;
	}
	
}
