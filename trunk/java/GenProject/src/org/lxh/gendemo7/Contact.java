package org.lxh.gendemo7;

public class Contact implements Info {
	private String address ;
	private String city ;
	public Contact(String address, String city) {
		super();
		this.address = address;
		this.city = city;
	}
	
	public String toString() {
		return "���У�" + this.city + "����ַ�� " + this.address;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
