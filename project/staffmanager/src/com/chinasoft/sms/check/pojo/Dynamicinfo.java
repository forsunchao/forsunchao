package com.chinasoft.sms.check.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Dynamicinfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Dynamicinfo implements java.io.Serializable {

	// Fields

	private Long dynamicId;
	private Checklibraryinfo checklibraryinfo;
	private Long dynamicNumber;
	private Set checkparticularresultinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dynamicinfo() {
	}

	/** minimal constructor */
	public Dynamicinfo(Long dynamicId) {
		this.dynamicId = dynamicId;
	}

	/** full constructor */
	public Dynamicinfo(Long dynamicId, Checklibraryinfo checklibraryinfo,
			Long dynamicNumber, Set checkparticularresultinfos) {
		this.dynamicId = dynamicId;
		this.checklibraryinfo = checklibraryinfo;
		this.dynamicNumber = dynamicNumber;
		this.checkparticularresultinfos = checkparticularresultinfos;
	}

	// Property accessors

	public Long getDynamicId() {
		return this.dynamicId;
	}

	public void setDynamicId(Long dynamicId) {
		this.dynamicId = dynamicId;
	}

	public Checklibraryinfo getChecklibraryinfo() {
		return this.checklibraryinfo;
	}

	public void setChecklibraryinfo(Checklibraryinfo checklibraryinfo) {
		this.checklibraryinfo = checklibraryinfo;
	}

	public Long getDynamicNumber() {
		return this.dynamicNumber;
	}

	public void setDynamicNumber(Long dynamicNumber) {
		this.dynamicNumber = dynamicNumber;
	}

	public Set getCheckparticularresultinfos() {
		return this.checkparticularresultinfos;
	}

	public void setCheckparticularresultinfos(Set checkparticularresultinfos) {
		this.checkparticularresultinfos = checkparticularresultinfos;
	}

}