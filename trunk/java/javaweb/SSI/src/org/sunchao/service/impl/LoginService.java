package org.sunchao.service.impl;

import org.sunchao.dao.ILoginDao;
import org.sunchao.service.ILoginService;
import org.sunchao.vo.User;

public class LoginService implements ILoginService {

	private ILoginDao loginDao;

	public ILoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(ILoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	public Integer login(User user) {
		return loginDao.login(user);
	}

}
