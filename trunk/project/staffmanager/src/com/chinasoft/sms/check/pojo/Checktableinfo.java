package com.chinasoft.sms.check.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Checktableinfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Checktableinfo implements java.io.Serializable {

	// Fields

	private Long checktableId;
	private Basicinfo basicinfo;
	private String ischeck;
	private String checktableGrade;
	private Long dynamicNumber;
	private Set checkflowinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Checktableinfo() {
	}

	/** minimal constructor */
	public Checktableinfo(Long checktableId, Basicinfo basicinfo) {
		this.checktableId = checktableId;
		this.basicinfo = basicinfo;
	}

	/** full constructor */
	public Checktableinfo(Long checktableId, Basicinfo basicinfo,
			String ischeck, String checktableGrade, Long dynamicNumber,
			Set checkflowinfos) {
		this.checktableId = checktableId;
		this.basicinfo = basicinfo;
		this.ischeck = ischeck;
		this.checktableGrade = checktableGrade;
		this.dynamicNumber = dynamicNumber;
		this.checkflowinfos = checkflowinfos;
	}

	// Property accessors

	public Long getChecktableId() {
		return this.checktableId;
	}

	public void setChecktableId(Long checktableId) {
		this.checktableId = checktableId;
	}

	public Basicinfo getBasicinfo() {
		return this.basicinfo;
	}

	public void setBasicinfo(Basicinfo basicinfo) {
		this.basicinfo = basicinfo;
	}

	public String getIscheck() {
		return this.ischeck;
	}

	public void setIscheck(String ischeck) {
		this.ischeck = ischeck;
	}

	public String getChecktableGrade() {
		return this.checktableGrade;
	}

	public void setChecktableGrade(String checktableGrade) {
		this.checktableGrade = checktableGrade;
	}

	public Long getDynamicNumber() {
		return this.dynamicNumber;
	}

	public void setDynamicNumber(Long dynamicNumber) {
		this.dynamicNumber = dynamicNumber;
	}

	public Set getCheckflowinfos() {
		return this.checkflowinfos;
	}

	public void setCheckflowinfos(Set checkflowinfos) {
		this.checkflowinfos = checkflowinfos;
	}

}