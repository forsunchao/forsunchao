package com.chinasoft.sms.check.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.sms.check.pojo.Checklibraryinfo;
import com.chinasoft.sms.check.service.ChecklibraryinfoService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CheckLibraryAction extends ActionSupport
{
	private  long  id; 
	private String content;
	private ChecklibraryinfoService cliService;
	private  List<Checklibraryinfo> results;
	private static final long serialVersionUID = 23242364221L;
	private String state;
	public String addLibraryinfo()
	{
		 if (this.cliService.addChecklibraryinfo(id, content))
			  return INPUT;
		  else
		      return SUCCESS;
	}
	public String deleteLibraryinfo()
	{
		 if (this.cliService.deleteCheckLibraryinfo(id))
			  return SUCCESS;
		  else
		      return INPUT;
	}
	public String updateLibraryinfo()
	{
		if (this.cliService.updateCheckLibrayinfo(id, content))
			  return SUCCESS;
	  else
	      return INPUT;
	}
	public String viewcheck() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("checkflowlist", cliService.queryACheckedByState(state));
		if ("0".equals(state)) {
			return "aaCheck";
		} else if ("1".equals(state)) {
			return "nnCheck";
		} else {
			return "rejectCheck";
		}
	}
	public String queryLibraryinfo()
	{
		results = cliService.findAll();
		return SUCCESS;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ChecklibraryinfoService getCliService() {
		return cliService;
	}
	public void setCliService(ChecklibraryinfoService cliService) {
		this.cliService = cliService;
	}
	public List<Checklibraryinfo> getResults() {
		return results;
	}
	public void setResults(List<Checklibraryinfo> results) {
		this.results = results;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
