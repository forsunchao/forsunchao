package com.chinasoft.sms.contract.action;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.contract.pojo.Compactinfo;
import com.chinasoft.sms.contract.service.ContractService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @author jinhua.yang
 *
 */
public class newAction extends ActionSupport {
	private Compactinfo compactinfo;
	private Basicinfo basicinfo;
	private ContractService contractservice;
	private List<Compactinfo> results;
	private List<Basicinfo> resultsb;
	private String searchType;
	private String conditionValue;
	private String contractText;
	
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

	public String donewquery() throws Exception {
		// ��ȡ��ͬģ��
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx
				.get(ServletActionContext.HTTP_REQUEST);
		String path = request.getSession().getServletContext().getRealPath(
				"/file");
		File file=null;
		File  dri=new File(path);
		if(dri.isDirectory()){
			File [] subFiles=dri.listFiles();
			int length=subFiles.length;
			if(length==1&&subFiles[0].getName().endsWith(".txt")){
				file=subFiles[0];
			}else if(length>1){
				long modTime=subFiles[0].lastModified();
				file=subFiles[0];
				for(int index=1;index<length;index++){
					if(subFiles[index].lastModified()>modTime){
						file=subFiles[index];
						modTime=file.lastModified();
					}
					
				}
				
			}

		}
		if (file!=null&&file.isFile()) {
			InputStreamReader read = new InputStreamReader(new FileInputStream(
					file), "UTF-8");
			BufferedReader reader = new BufferedReader(read);
			StringBuffer constractBuf = new StringBuffer();
			String readline = null;
			while ((readline = reader.readLine()) != null) {
				readline = readline.replaceAll("context", "<input type=\"text\" name=\"contrtext\" class=\"input1\"  readonly=\"read\"/>");
				constractBuf.append(readline);
				constractBuf.append("<br/>");
			}
			reader.close();
			read.close();
			request.setAttribute("contract", constractBuf.toString());

		} else {
			request.setAttribute("contract", "");
		}
		results = contractservice.contractquery(searchType, conditionValue);
		return SUCCESS;
	}

	public String newCompactinfo()throws Exception {
		HttpServletRequest   request=ServletActionContext.getRequest();
		HttpServletResponse  response=ServletActionContext.getResponse();
		response.setContentType("text/xml;charset=UTF-8");
		response.setHeader("Cache-Control", "no-cache");
		response.setCharacterEncoding("UTF-8");
		String  conditionValue=request.getParameter("conditionValue");
		resultsb=contractservice.basicinfoquery(conditionValue);
		Basicinfo  basicinfo=resultsb.get(0);
		StringBuffer  resStr=new StringBuffer();
		resStr.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		resStr.append("<basicinfo>");
/*		resStr.append("<staffNumber>");
		resStr.append(basicinfo.getStaffNumber());
		resStr.append("</staffNumber>");*/
		resStr.append("<name>");
		resStr.append(basicinfo.getName());
		resStr.append("</name>");
		resStr.append("</basicinfo>");
		response.getWriter().write(resStr.toString());
		return null;

	}
	public String donew() throws Exception {
		contractservice.contractnew(compactinfo);
		return SUCCESS;

	}

	public Compactinfo getCompactinfo() {
		return compactinfo;
	}

	public void setCompactinfo(Compactinfo compactinfo) {
		this.compactinfo = compactinfo;
	}

	public ContractService getContractservice() {
		return contractservice;
	}

	public void setContractservice(ContractService contractservice) {
		this.contractservice = contractservice;
	}

	public List<Compactinfo> getResults() {
		return results;
	}

	public void setResults(List<Compactinfo> results) {
		this.results = results;
	}

	public String getContractText() {
		return contractText;
	}

	public void setContractText(String contractText) {
		this.contractText = contractText;
	}

	public List<Basicinfo> getResultsb() {
		return resultsb;
	}

	public void setResultsb(List<Basicinfo> resultsb) {
		this.resultsb = resultsb;
	}

}
