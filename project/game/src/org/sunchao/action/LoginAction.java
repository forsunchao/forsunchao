package org.sunchao.action;

import org.sunchao.service.ILoginService;
import org.sunchao.vo.User;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private ILoginService loginService;
	private User user;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		Integer i = loginService.login(user);
		if (null == i || i <= 0) {
			return ERROR;
		}
		return SUCCESS;
	}

	public ILoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
