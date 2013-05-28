package org.sunchao.service.impl;

import org.sunchao.dao.IAddDao;
import org.sunchao.service.IAddService;
import org.sunchao.vo.GameItem;

public class AddService implements IAddService {

	private IAddDao addDao;

	public IAddDao getAddDao() {
		return addDao;
	}

	public void setAddDao(IAddDao addDao) {
		this.addDao = addDao;
	}

	@Override
	public void add(GameItem gameItem) {
		addDao.add(gameItem);
	}
}
