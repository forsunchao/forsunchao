package org.sunchao.service.impl;

import java.util.List;

import org.sunchao.dao.IQueryDao;
import org.sunchao.service.IQueryService;
import org.sunchao.vo.GameItem;

public class QueryService implements IQueryService {

	private IQueryDao queryDao;

	public IQueryDao getQueryDao() {
		return queryDao;
	}

	public void setQueryDao(IQueryDao queryDao) {
		this.queryDao = queryDao;
	}

	@Override
	public List<GameItem> query(GameItem gameItem) {
		return queryDao.query(gameItem);
	}
}
