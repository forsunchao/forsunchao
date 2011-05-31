package org.sunchao.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadListAction extends ActionSupport {
	private List<File> file; // �ļ�
	private String title;// �ļ�����
	private List<String> fileFileName;// �ļ�����
	private List<String> fileContentType; // �ļ�����
	private List<String> rename = new ArrayList<String>();

	public List<File> getFile() {
		return file;
	}

	public void setFile(List<File> file) {
		this.file = file;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(List<String> fileFileName) {
		this.fileFileName = fileFileName;
	}

	public List<String> getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(List<String> fileContentType) {
		this.fileContentType = fileContentType;
	}
	
	public List<String> getRename() {
		return rename;
	}

	public void setRename(List<String> rename) {
		this.rename = rename;
	}
	
	public void copy(File src, File dst) {
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		// 1. �����ļ�
			try {
				in = new BufferedInputStream(new FileInputStream(src));
				out = new BufferedOutputStream(new FileOutputStream(dst));
				byte[] buf = new byte[(int) src.length()];// �����ֽ����鳤��ΪԴ�ļ��ĳ���
				int len = 0;
				while ((len = in.read(buf)) != -1) {
					out.write(buf);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (null != in) {
					try {
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if (null != out) {
					try {
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	
	
	public static String getExtention(String fileFileName) {
		int pos = fileFileName.lastIndexOf(".");// �õ��ļ��������һ�����λ��
		return fileFileName.substring(pos);// �����λ�ÿ�ʼ��ȡ�����
	}
	
	public String execute() throws Exception {
		for (int i=0; i<file.size(); i++) {
			String rename1 = new Date().getTime() + getExtention(fileFileName.get(i));// �µ��ļ���=��ǰʱ��+�ļ���չ��
			rename.add(rename1);
			File newFile = new File(ServletActionContext.getServletContext().getRealPath("/upload") + "/" + rename1);
			new UploadListAction().copy(file.get(i), newFile);
		}
		
		return SUCCESS;
	}
}
