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
	private File file;// 接收一个文件
	// 文件类型，<s:file name="xxx"/>对应Action类里面的xxx、xxxContentType和xxxFileName三个属性。
	private String fileFileName;// 定义文件的名字
	private String fileContentType;
	private String rename;// 对文件按时间进行重命名

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

	/* 进行文件的拷贝，从源文件到目的文件 */
	public static void copy(File src, File dst) {
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		try {
			in = new BufferedInputStream(new FileInputStream(src));
			out = new BufferedOutputStream(new FileOutputStream(dst));
			byte[] buf = new byte[(int) src.length()];// 定义字节数组长度为源文件的长度
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

	/* 得到文件的后缀名 */
	public static String getExtention(String fileFileName) {
		int pos = fileFileName.lastIndexOf(".");// 得到文件名中最后一个点的位置
		return fileFileName.substring(pos);// 从这个位置开始截取到最后
	}

	@Override
	public String execute() throws Exception {
		rename = new Date().getTime() + getExtention(fileFileName);// 新的文件名=当前时间+文件扩展名
		File newFile = new File(ServletActionContext.getServletContext().getRealPath("/upload") + "/" + rename);
		copy(file, newFile);
		return SUCCESS;
	}
}
