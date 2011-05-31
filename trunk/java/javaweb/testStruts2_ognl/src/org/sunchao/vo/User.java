package org.sunchao.vo;

public class User {
	private String username;
	private String password;
	private Address address;
	
	public String get() {
		return "User类中的普通方法get()";
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
