package org.sunchao.action;

import java.util.Locale;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ChangeLangAction extends ActionSupport {
	private String lang;

	public String doDefault() {
		return LOGIN;
	}
	
	public String execute() throws Exception {
		Locale locale = null;
		if (lang.equals("1")) {
			// ��ʾ����
			locale = Locale.CHINA;
		} else {
			// ��ʾӢ��
			locale = Locale.US;
		}
		ActionContext.getContext().setLocale(locale);// �õ�locale
		ServletActionContext.getRequest().getSession().setAttribute(
				"WW_TRANS_I18N_LOCALE", locale);
		return LOGIN;
	}

}
