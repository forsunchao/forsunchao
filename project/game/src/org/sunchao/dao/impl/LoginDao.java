package org.sunchao.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.sunchao.dao.ILoginDao;
import org.sunchao.vo.User;

public class LoginDao extends SqlMapClientDaoSupport implements ILoginDao {

	@Override
	public Integer login(User user) {
		return (Integer) getSqlMapClientTemplate().queryForObject("login", user);
	}
}
