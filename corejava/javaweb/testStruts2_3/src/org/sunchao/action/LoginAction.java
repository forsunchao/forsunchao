package org.sunchao.action;

import org.sunchao.vo.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


/*public class LoginAction extends ActionSupport implements ModelDriven{
	private User user = new User();//这里不需要写setter，getter方法，但是需要去new
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute() throws Exception{
		if(user.getUsername().trim().equals("sunchao") && user.getPassword().trim().equals("123456")) {
//		if(user.getUsername() !=null && user.getPassword().trim().equals("123456")) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	public Object getModel() {
		return user;
	}
}*/

public class LoginAction extends ActionSupport {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute() throws Exception{
		if(user.getUsername().trim().equals("sunchao") && user.getPassword().trim().equals("123456")) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}
