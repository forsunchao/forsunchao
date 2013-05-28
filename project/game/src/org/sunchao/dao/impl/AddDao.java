package org.sunchao.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.sunchao.dao.IAddDao;
import org.sunchao.vo.GameItem;

public class AddDao extends SqlMapClientDaoSupport implements IAddDao {

	@Override
	public void add(GameItem gameItem) {
		getSqlMapClientTemplate().insert("add", gameItem);
	}
}
