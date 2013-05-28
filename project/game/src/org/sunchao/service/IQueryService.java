package org.sunchao.service;

import java.util.List;

import org.sunchao.vo.GameItem;

public interface IQueryService {
	List<GameItem> query(GameItem gameItem);
}
