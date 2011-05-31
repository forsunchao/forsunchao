package com.chinasoft.sms.admin.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.sms.admin.service.UserService;
import com.chinasoft.sms.check.pojo.Basicinfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteUserAction extends ActionSupport{
private UserService userService;

private  String staffNumber;
public UserService getUserService() {
	return userService;
}
public void setUserService(UserService userService) {
	this.userService = userService;
}

public String execute() throws Exception {
	Basicinfo basicinfo =new Basicinfo();
	basicinfo.setStaffNumber(Long.valueOf(staffNumber));
	userService.delUser(basicinfo);
	return SUCCESS;
}
public String getStaffNumber() {
	return staffNumber;
}
public void setStaffNumber(String staffNumber) {
	this.staffNumber = staffNumber;
}


}
