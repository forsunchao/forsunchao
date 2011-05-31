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
			this.addFieldError("user.username", "用户名不能为空");
		} else if (!Pattern.matches("^[a-zA-Z_][a-zA-Z_0-9]${4,9}", "user.getUsername()")) {
			this.addFieldError("user.username", "用户名格式不正确");
		}
		if (user.getPassword() == null || user.getPassword().equals("")) {
			this.addFieldError("user.password", "密码不能为空");
		} else if (!Pattern.matches("^[a-zA-Z_0-9!@#$%]${5,10}", "user.getPassword()")) {
			this.addFieldError("user.password", "密码格式不正确");
		}
	}

	public void validateReg() {
		if (!user.getPassword().equals(user.getRepassword())) {
			this.addFieldError("user.repassword", "两次密码输入不一致");
		}
		if (user.getAge() < 18 || user.getAge() > 100) {
			this.addFieldError("user.age", "请确保您已经成年了");
		}
	}

	public void validateLogin() {

	}*/

	public String reg() {
		/*if (hasFieldErrors()) {// 如果存在以上才错误，则进行判断
			return INPUT;
		}*/
		return SUCCESS;
	}

	public String login() {
		/*if (hasFieldErrors()) {// 如果存在以上才错误，则进行判断
			return INPUT;
		}*/
		return SUCCESS;
	}
}
