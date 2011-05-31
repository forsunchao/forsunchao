package com.etc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Employee1 entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Employee1 implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer EId;
	private String EName;
	private String EAddress;
	private Collection<String> phoneses = new ArrayList<String>();

	// Constructors

	/** default constructor */
	public Employee1() {
	}

	/** full constructor */
	public Employee1(String EName, String EAddress, List phoneses) {
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

	public Collection<String> getPhoneses() {
		return this.phoneses;
	}

	public void setPhoneses(List phoneses) {
		this.phoneses = phoneses;
	}

}