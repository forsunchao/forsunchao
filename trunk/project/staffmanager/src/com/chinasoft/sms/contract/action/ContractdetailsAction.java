package com.chinasoft.sms.contract.action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.sms.contract.pojo.Compactinfo;
import com.chinasoft.sms.contract.service.ContractService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/***
 * 
 * @author jinhua.yang
 *
 */
public class ContractdetailsAction extends ActionSupport {
	private ContractService contractservice;
	private List<Compactinfo> results;
	private Compactinfo  compactinfo;
	private String searchType;
	private String conditionValue;
	private String contractText;
	private int count = 1;
	/**
	 * 加载合同信息
	 */
	public String loadCon(Compactinfo compactinfo) throws Exception{
		ActionContext ctx = ActionContext.getContext();
	HttpServletRequest request = (HttpServletRequest) ctx
			.get(ServletActionContext.HTTP_REQUEST);
	String path = request.getSession().getServletContext().getRealPath(
			"/file");
	File file = null;
	File dri = new File(path);
	if (dri.isDirectory()) {
		File[] subFiles = dri.listFiles();
		int length = subFiles.length;
		if (length == 1 && subFiles[0].getName().endsWith(".txt")) {
			file = subFiles[0];
		} else if (length > 1) {
			long modTime = subFiles[0].lastModified();
			file = subFiles[0];
			for (int index = 1; index < length; index++) {
				if (subFiles[index].lastModified() > modTime) {
					file = subFiles[index];
					modTime = file.lastModified();
				}

			}

		}

	}
	if (file != null && file.isFile()) {
		InputStreamReader read = new InputStreamReader(new FileInputStream(
				file), "UTF-8");
		BufferedReader reader = new BufferedReader(read);
		StringBuffer constractBuf = new StringBuffer();
		String readline = null;
		while ((readline = reader.readLine()) != null) {
			readline=setContractext(readline);
			constractBuf.append(readline);
			constractBuf.append("\r\n");
		}
		reader.close();
		read.close();

		String constractstr = constractBuf.toString();
		
		DateFormat  df= new SimpleDateFormat("yyyy-MM-dd");
		constractstr=constractstr.replace("(1)", "___"+String.valueOf(compactinfo.getCompactId()+"___"));
		constractstr=constractstr.replace("(2)", "___"+String.valueOf(compactinfo.getBasicinfo().getName()+"___"));
		constractstr=constractstr.replace("(3)", "___"+df.format(compactinfo.getSignDate())+"___");
		constractstr=constractstr.replace("(4)", "___"+df.format(compactinfo.getOutDate())+"___");
		constractstr=constractstr.replace("(5)","___"+compactinfo.getSalary()+"___");
		
		constractstr=constractstr.replaceAll("[(][0-9]+[)]", "_________");
		request.setAttribute("contract", constractstr);	
		count=1;
	} else {
		request.setAttribute("contract", "");
	}
	return "success";
}
		
	public String dodetails()throws Exception {
		Long id = new Long(Integer.parseInt(conditionValue));
		Compactinfo result = contractservice.contractquery1(id);
		this.loadCon(result);
		return SUCCESS;	
	}
	
	public ContractService getContractservice() {
		return contractservice;
	}
	public void setContractservice(ContractService contractservice) {
		this.contractservice = contractservice;
	}
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
	public String getContractText() {
		return contractText;
	}
	public void setContractText(String contractText) {
		this.contractText = contractText;
	}
	private  String setContractext(String str) {

		if (str.indexOf("context") != -1) {
			str = str.replaceAll("context", "(" + String.valueOf(count)+")");
			count++;
			if(str.indexOf("context") != -1) {
		    	return setContractext(str);
		    }else{
		    	return str;
		    }
		
		} else {
			return str;
		}

	}
}
