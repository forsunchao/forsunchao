package com.chinasoft.sms.check.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.sms.check.pojo.Checklibraryinfo;
import com.chinasoft.sms.check.pojo.Dynamicinfo;
import com.chinasoft.sms.check.service.IChecklibraryinfoService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GetContentAction extends ActionSupport {
	public long checklibrary_id;
	public String checklibrary_content;
	private IChecklibraryinfoService cliService;
	private List<Dynamicinfo> contentList;
	

	public String execute() throws Exception// Ö´ÐÐ
	{
		//ActionContext ctx = ActionContext.getContext();
		//HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
		//request.setAttribute("checkcontents", cliService.queryCheckContByNub(new Long(1)));
		contentList=cliService.queryCheckContByNub(new Long(1));
		return SUCCESS;
	}

	public long getChecklibrary_id() {
		return checklibrary_id;
	}

	public void setChecklibrary_id(long checklibrary_id) {
		this.checklibrary_id = checklibrary_id;
	}

	public String getChecklibrary_content() {
		return checklibrary_content;
	}

	public void setChecklibrary_content(String checklibrary_content) {
		this.checklibrary_content = checklibrary_content;
	}

	public IChecklibraryinfoService getCliService() {
		return cliService;
	}

	public void setCliService(IChecklibraryinfoService cliService) {
		this.cliService = cliService;
	}

	public List<Dynamicinfo> getContentList() {
		return contentList;
	}

	public void setContentList(List<Dynamicinfo> contentList) {
		this.contentList = contentList;
	}

}
