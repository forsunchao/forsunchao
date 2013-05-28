package org.sunchao.dao;

import java.util.List;

import org.sunchao.vo.GameItem;

public interface IQueryDao {
	List<GameItem> query(GameItem gameItem);
}
