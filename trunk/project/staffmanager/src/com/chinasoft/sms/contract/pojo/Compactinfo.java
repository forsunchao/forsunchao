package com.chinasoft.sms.contract.pojo;

import java.util.Date;

import com.chinasoft.sms.check.pojo.Basicinfo;

/**
 * Compactinfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Compactinfo implements java.io.Serializable {

	// Fields

	private Long compactId;
	private Basicinfo basicinfo;
	private Date signDate;
	private Date outDate;
	private String salary;
	private String compactState;

	// Constructors

	/** default constructor */
	public Compactinfo() {
	}

	/** minimal constructor */
	public Compactinfo(Long compactId, Date signDate, Date outDate) {
		this.compactId = compactId;
		this.signDate = signDate;
		this.outDate = outDate;
	}

	/** full constructor */
	public Compactinfo(Long compactId, Basicinfo basicinfo, Date signDate,
			Date outDate, String salary, String compactState) {
		this.compactId = compactId;
		this.basicinfo = basicinfo;
		this.signDate = signDate;
		this.outDate = outDate;
		this.salary = salary;
		this.compactState = compactState;
	}

	// Property accessors

	public Long getCompactId() {
		return this.compactId;
	}

	public void setCompactId(Long compactId) {
		this.compactId = compactId;
	}

	public Basicinfo getBasicinfo() {
		return this.basicinfo;
	}

	public void setBasicinfo(Basicinfo basicinfo) {
		this.basicinfo = basicinfo;
	}

	public Date getSignDate() {
		return this.signDate;
	}

	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	public Date getOutDate() {
		return this.outDate;
	}

	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}

	public String getSalary() {
		return this.salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCompactState() {
		return this.compactState;
	}

	public void setCompactState(String compactState) {
		this.compactState = compactState;
	}

}