package com.chinasoft.sms.check.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Departmentinfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Departmentinfo implements java.io.Serializable {

	// Fields

	private Long departmentId;
	private String departmentName;
	private Set basicinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Departmentinfo() {
	}

	/** minimal constructor */
	public Departmentinfo(Long departmentId) {
		this.departmentId = departmentId;
	}

	/** full constructor */
	public Departmentinfo(Long departmentId, String departmentName,
			Set basicinfos) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.basicinfos = basicinfos;
	}

	// Property accessors

	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set getBasicinfos() {
		return this.basicinfos;
	}

	public void setBasicinfos(Set basicinfos) {
		this.basicinfos = basicinfos;
	}

}