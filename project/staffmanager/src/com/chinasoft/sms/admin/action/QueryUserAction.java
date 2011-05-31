package com.chinasoft.sms.admin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.sms.admin.service.UserService;
import com.chinasoft.sms.common.Page;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class QueryUserAction extends ActionSupport{
	/**
	 * 
	 */
	private String searchType;
	private String conditionValue;
	private UserService userService;
	private Page page;
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getConditionValue() {
		return conditionValue;
	}
	public void setConditionValue(String conditionValue) {
		this.conditionValue = conditionValue;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String doquery() throws Exception {
		System.out.println("该方法执行了！");
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("basicinfo",  userService.query(searchType, conditionValue));
		return SUCCESS;
	}
	@Override
	public String execute() throws Exception {
		String hql = null;
//		HttpServletRequest request=ServletActionContext.getRequest();
//		request.setAttribute("basicinfo",  userService.queryAlList());
		
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
		//request.setAttribute("basicinfo",  userService.queryAlList()); 
		request.setAttribute("basicinfo",  userService.queryUser(page, "")); 
		return SUCCESS;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	
	
	

}
