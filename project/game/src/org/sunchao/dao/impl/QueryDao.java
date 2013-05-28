package org.sunchao.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.sunchao.dao.IQueryDao;
import org.sunchao.vo.GameItem;

public class QueryDao extends SqlMapClientDaoSupport implements IQueryDao {

	@Override
	public List<GameItem> query(GameItem gameItem) {
		return getSqlMapClientTemplate().queryForList("query");
	}
}
