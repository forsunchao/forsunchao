package org.chenwei.action;

import java.util.regex.Pattern;

import org.chenwei.vo.User;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/*public void validate() {
		if (user.getUsername() == null || user.getUsername().equals("")) {
			this.addFieldError("user.username", "�û�������Ϊ��");
		} else if (!Pattern.matches("^[a-zA-Z_][a-zA-Z_0-9]${4,9}", "user.getUsername()")) {
			this.addFieldError("user.username", "�û�����ʽ����ȷ");
		}
		if (user.getPassword() == null || user.getPassword().equals("")) {
			this.addFieldError("user.password", "���벻��Ϊ��");
		} else if (!Pattern.matches("^[a-zA-Z_0-9!@#$%]${5,10}", "user.getPassword()")) {
			this.addFieldError("user.password", "�����ʽ����ȷ");
		}
	}

	public void validateReg() {
		if (!user.getPassword().equals(user.getRepassword())) {
			this.addFieldError("user.repassword", "�����������벻һ��");
		}
		if (user.getAge() < 18 || user.getAge() > 100) {
			this.addFieldError("user.age", "��ȷ�����Ѿ�������");
		}
	}

	public void validateLogin() {

	}*/

	public String reg() {
		/*if (hasFieldErrors()) {// ����������ϲŴ���������ж�
			return INPUT;
		}*/
		return SUCCESS;
	}

	public String login() {
		/*if (hasFieldErrors()) {// ����������ϲŴ���������ж�
			return INPUT;
		}*/
		return SUCCESS;
	}
}
