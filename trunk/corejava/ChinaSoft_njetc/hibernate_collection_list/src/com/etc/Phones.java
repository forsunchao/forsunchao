package com.etc;

/**
 * Phones entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Phones implements java.io.Serializable {

	// Fields

	private Integer id;
	private Employee1 employee1;
	private Integer phone;
	private String bz;

	// Constructors

	/** default constructor */
	public Phones() {
	}

	/** minimal constructor */
	public Phones(Employee1 employee1) {
		this.employee1 = employee1;
	}

	/** full constructor */
	public Phones(Employee1 employee1, Integer phone, String bz) {
		this.employee1 = employee1;
		this.phone = phone;
		this.bz = bz;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee1 getEmployee1() {
		return this.employee1;
	}

	public void setEmployee1(Employee1 employee1) {
		this.employee1 = employee1;
	}

	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}