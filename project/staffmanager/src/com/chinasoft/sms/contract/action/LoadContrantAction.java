package com.chinasoft.sms.contract.action;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoadContrantAction extends ActionSupport {

	private String contractText;

	/**
	 *加载合同模板
	 */
	public String loadCon() throws Exception {
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
				readline = readline.replaceAll("context", "_______");
				constractBuf.append(readline);
				constractBuf.append("\r\n");
			}
			reader.close();
			read.close();
			request.setAttribute("contract", constractBuf.toString());

		} else {
			request.setAttribute("contract", "");
		}
		return SUCCESS;
	}

	/**
	 *修改合同模板
	 */
	public String writeCon() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx
				.get(ServletActionContext.HTTP_REQUEST);
		String path = request.getSession().getServletContext().getRealPath(
				"/file")
				+ "/contract_template_"
				+ String.valueOf(System.currentTimeMillis()) + ".txt";
		File file = new File(path);
		if (!file.exists()) {
			// 新建文件
			if (file.createNewFile()) {
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(file, false), "UTF-8");
				BufferedWriter bufWriter = new BufferedWriter(write);
				contractText=java.net.URLDecoder.decode(contractText, "UTF-8");
				contractText = contractText.replaceAll("\t", "    ");
				contractText = contractText.replaceAll("_+", "context");
				String strArray[] = contractText.split("\r\n");
				int length = strArray.length;
				for (int index = 0; index < length; index++) {
					bufWriter.write(strArray[index]);
					bufWriter.write("\r\n");
				}
				file.setReadOnly();
				bufWriter.close();
				write.close();
			}

		} else {

		}
		return SUCCESS;
	}

	public String getContractText() {
		return contractText;
	}

	public void setContractText(String contractText) {
		this.contractText = contractText;
	}

}
