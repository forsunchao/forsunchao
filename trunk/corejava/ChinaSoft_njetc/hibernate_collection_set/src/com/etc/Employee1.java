package com.etc;

import java.util.HashSet;
import java.util.Set;

/**
 * Employee1 entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Employee1 implements java.io.Serializable {

	// Fields

	private Integer EId;
	private String EName;
	private String EAddress;
	private Set phoneses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Employee1() {
	}

	/** full constructor */
	public Employee1(String EName, String EAddress, Set phoneses) {
		this.EName = EName;
		this.EAddress = EAddress;
		this.phoneses = phoneses;
	}

	// Property accessors

	public Integer getEId() {
		return this.EId;
	}

	public void setEId(Integer EId) {
		this.EId = EId;
	}

	public String getEName() {
		return this.EName;
	}

	public void setEName(String EName) {
		this.EName = EName;
	}

	public String getEAddress() {
		return this.EAddress;
	}

	public void setEAddress(String EAddress) {
		this.EAddress = EAddress;
	}

	public Set getPhoneses() {
		return this.phoneses;
	}

	public void setPhoneses(Set phoneses) {
		this.phoneses = phoneses;
	}

}