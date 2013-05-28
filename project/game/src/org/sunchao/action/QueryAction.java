package org.sunchao.action;

import java.util.List;

import org.sunchao.service.impl.QueryService;
import org.sunchao.vo.GameItem;

import com.opensymphony.xwork2.ActionSupport;

public class QueryAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private QueryService queryService;
	private GameItem gameItem;
	private List<GameItem> list;

	@Override
	public String execute() throws Exception {
		list = queryService.query(gameItem);

		return SUCCESS;
	}

	public List<GameItem> getList() {
		return list;
	}

	public void setList(List<GameItem> list) {
		this.list = list;
	}

	public QueryService getQueryService() {
		return queryService;
	}

	public void setQueryService(QueryService queryService) {
		this.queryService = queryService;
	}

	public GameItem getGameItem() {
		return gameItem;
	}

	public void setGameItem(GameItem gameItem) {
		this.gameItem = gameItem;
	}
}
