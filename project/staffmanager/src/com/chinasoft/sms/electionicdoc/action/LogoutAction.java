package com.chinasoft.sms.electionicdoc.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {
	public String execute() throws Exception { 
        ActionContext.getContext().getSession().remove("user"); 
        return SUCCESS; 
    } 

}
