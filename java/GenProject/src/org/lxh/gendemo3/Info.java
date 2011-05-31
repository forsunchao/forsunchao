package org.lxh.gendemo3;

public class Info<T> {
	private T msg;

	public Info(T msg) {
		this.msg = msg;
	}

	public T getMsg() {
		return msg;
	}

	public void setMsg(T msg) {
		this.msg = msg;
	}
}
