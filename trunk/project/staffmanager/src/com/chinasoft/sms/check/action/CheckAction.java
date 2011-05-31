package com.chinasoft.sms.check.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.sms.check.service.ICheckService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CheckAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 23242364221L;
	private ICheckService checkService;
	private String state;
	private String staffNub;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ICheckService getCheckService() {
		return checkService;
	}

	public void setCheckService(ICheckService checkService) {
		this.checkService = checkService;
	}

	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx
				.get(ServletActionContext.HTTP_REQUEST);
		// ����ѯ��4���ѿ��ˡ�δ���ˡ����ؿ��������Ϣ��ŵ�request����ȥ
		request.setAttribute("checkflowlist", checkService
				.queryACheckedByState(state));
		if ("0".equals(state)) {
			return "aCheck";
		} else if ("1".equals(state)) {
			return "nCheck";
		} else {
			return "reject";
		}
	}
	public String queryFlowinfo() {
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest)ctx.get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("flowlist", checkService.queryFlowinfoBystaffNub(staffNub));
		return SUCCESS;
	}
	public String getStaffNub() {
		return staffNub;
	}

	public void setStaffNub(String staffNub) {
		this.staffNub = staffNub;
	}

}
