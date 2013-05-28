package org.sunchao.action;

import org.sunchao.service.impl.AddService;
import org.sunchao.vo.GameItem;

import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private AddService addService;
	private GameItem gameItem;

	@Override
	public String execute() throws Exception {
		addService.add(gameItem);
		return SUCCESS;
	}

	public AddService getAddService() {
		return addService;
	}

	public void setAddService(AddService addService) {
		this.addService = addService;
	}

	public GameItem getGameItem() {
		return gameItem;
	}

	public void setGameItem(GameItem gameItem) {
		this.gameItem = gameItem;
	}
}
