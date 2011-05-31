package com.chinasoft.sms.account.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.sms.account.service.staffUpdateService;
import com.chinasoft.sms.check.pojo.Basicinfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class updateAccountAction extends ActionSupport {

	staffUpdateService service;

	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx
				.get(ServletActionContext.HTTP_REQUEST);
		HttpServletResponse response = (HttpServletResponse) ctx
				.get(ServletActionContext.HTTP_RESPONSE);
		response.setCharacterEncoding("UTF-8");
		String oldPassword = request.getParameter("oldPassword");
		String confirmPassword = request.getParameter("confirmPassword");
		String secondPassword = request.getParameter("newPassword");
		Object ob = request.getSession().getAttribute("user");
		Basicinfo bi = null;
		boolean success = false;
		if (ob != null) {
			bi = (Basicinfo) ob;
			// 修改用户密码
			success = service.updatepassword(bi);

			// 1.修改成功，0.修改失败
			if (success) {
				response.getWriter().println("1");

			} else if(!confirmPassword.equals(secondPassword) ) {
				response.getWriter().println("3");
			}
			else {
				response.getWriter().println("0");
			}
		} else {
			response.getWriter().println("2");
		}
		return null;
	}

	public staffUpdateService getService() {
		return service;
	}

	public void setService(staffUpdateService service) {
		this.service = service;
	}

}
