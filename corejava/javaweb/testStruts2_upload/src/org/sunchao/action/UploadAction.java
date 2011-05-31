package org.sunchao.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	private File file;// ����һ���ļ�
	// �ļ����ͣ�<s:file name="xxx"/>��ӦAction�������xxx��xxxContentType��xxxFileName�������ԡ�
	private String fileFileName;// �����ļ�������
	private String fileContentType;
	private String rename;// ���ļ���ʱ�����������

	public File getFile() {
		return file;
	}

	public String getRename() {
		return rename;
	}

	public void setRename(String rename) {
		this.rename = rename;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public void setFile(File file) {
		this.file = file;
	}

	/* �����ļ��Ŀ�������Դ�ļ���Ŀ���ļ� */
	public static void copy(File src, File dst) {
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
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

	/* �õ��ļ��ĺ�׺�� */
	public static String getExtention(String fileFileName) {
		int pos = fileFileName.lastIndexOf(".");// �õ��ļ��������һ�����λ��
		return fileFileName.substring(pos);// �����λ�ÿ�ʼ��ȡ�����
	}

	@Override
	public String execute() throws Exception {
		rename = new Date().getTime() + getExtention(fileFileName);// �µ��ļ���=��ǰʱ��+�ļ���չ��
		File newFile = new File(ServletActionContext.getServletContext().getRealPath("/upload") + "/" + rename);
		copy(file, newFile);
		return SUCCESS;
	}
}
