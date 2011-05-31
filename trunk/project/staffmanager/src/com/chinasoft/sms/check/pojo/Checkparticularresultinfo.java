package com.chinasoft.sms.check.pojo;

/**
 * Checkparticularresultinfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Checkparticularresultinfo implements java.io.Serializable {

	// Fields

	private Long resultId;
	private Basicinfo basicinfo;
	private Dynamicinfo dynamicinfo;
	private String resultGrade;

	// Constructors

	/** default constructor */
	public Checkparticularresultinfo() {
	}

	/** minimal constructor */
	public Checkparticularresultinfo(Long resultId, Basicinfo basicinfo,
			Dynamicinfo dynamicinfo) {
		this.resultId = resultId;
		this.basicinfo = basicinfo;
		this.dynamicinfo = dynamicinfo;
	}

	/** full constructor */
	public Checkparticularresultinfo(Long resultId, Basicinfo basicinfo,
			Dynamicinfo dynamicinfo, String resultGrade) {
		this.resultId = resultId;
		this.basicinfo = basicinfo;
		this.dynamicinfo = dynamicinfo;
		this.resultGrade = resultGrade;
	}

	// Property accessors

	public Long getResultId() {
		return this.resultId;
	}

	public void setResultId(Long resultId) {
		this.resultId = resultId;
	}

	public Basicinfo getBasicinfo() {
		return this.basicinfo;
	}

	public void setBasicinfo(Basicinfo basicinfo) {
		this.basicinfo = basicinfo;
	}

	public Dynamicinfo getDynamicinfo() {
		return this.dynamicinfo;
	}

	public void setDynamicinfo(Dynamicinfo dynamicinfo) {
		this.dynamicinfo = dynamicinfo;
	}

	public String getResultGrade() {
		return this.resultGrade;
	}

	public void setResultGrade(String resultGrade) {
		this.resultGrade = resultGrade;
	}

}