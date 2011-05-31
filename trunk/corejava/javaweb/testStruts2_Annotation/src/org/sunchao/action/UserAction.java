package org.sunchao.action;

import com.opensymphony.xwork2.ActionSupport;

/*
 * 基于注解的配置，没有成功
 * @ParentPackage(value="struts-default")
@Namespace(value="")
@Result(name="sucess",value="/userSuc.jsp")
@Results({
	@Result(name="sucess",value="/userSuc.jsp"),
	@Result(name="input",value="/userFail.jsp")
})

*/
public class UserAction extends ActionSupport {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() {
		if(username.trim().equalsIgnoreCase("sunchao") && password.equals("123456")) {
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
}
