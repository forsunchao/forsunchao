package com.chinasoft.sms.check.pojo;

/**
 * Checkflowinfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Checkflowinfo implements java.io.Serializable {

	// Fields

	private Long checkflowId;
	private Checktableinfo checktableinfo;
	private String commiter;
	private String accepter;
	private String checkflowState;
	private String checkflowStep;
	private String checkflowGrade;
	private String rejectRemark;
	private Long dynamicNumber;

	// Constructors

	/** default constructor */
	public Checkflowinfo() {
	}

	/** minimal constructor */
	public Checkflowinfo(Long checkflowId, Checktableinfo checktableinfo) {
		this.checkflowId = checkflowId;
		this.checktableinfo = checktableinfo;
	}

	/** full constructor */
	public Checkflowinfo(Long checkflowId, Checktableinfo checktableinfo,
			String commiter, String accepter, String checkflowState,
			String checkflowStep, String checkflowGrade, String rejectRemark,
			Long dynamicNumber) {
		this.checkflowId = checkflowId;
		this.checktableinfo = checktableinfo;
		this.commiter = commiter;
		this.accepter = accepter;
		this.checkflowState = checkflowState;
		this.checkflowStep = checkflowStep;
		this.checkflowGrade = checkflowGrade;
		this.rejectRemark = rejectRemark;
		this.dynamicNumber = dynamicNumber;
	}

	// Property accessors

	public Long getCheckflowId() {
		return this.checkflowId;
	}

	public void setCheckflowId(Long checkflowId) {
		this.checkflowId = checkflowId;
	}

	public Checktableinfo getChecktableinfo() {
		return this.checktableinfo;
	}

	public void setChecktableinfo(Checktableinfo checktableinfo) {
		this.checktableinfo = checktableinfo;
	}

	public String getCommiter() {
		return this.commiter;
	}

	public void setCommiter(String commiter) {
		this.commiter = commiter;
	}

	public String getAccepter() {
		return this.accepter;
	}

	public void setAccepter(String accepter) {
		this.accepter = accepter;
	}

	public String getCheckflowState() {
		return this.checkflowState;
	}

	public void setCheckflowState(String checkflowState) {
		this.checkflowState = checkflowState;
	}

	public String getCheckflowStep() {
		return this.checkflowStep;
	}

	public void setCheckflowStep(String checkflowStep) {
		this.checkflowStep = checkflowStep;
	}

	public String getCheckflowGrade() {
		return this.checkflowGrade;
	}

	public void setCheckflowGrade(String checkflowGrade) {
		this.checkflowGrade = checkflowGrade;
	}

	public String getRejectRemark() {
		return this.rejectRemark;
	}

	public void setRejectRemark(String rejectRemark) {
		this.rejectRemark = rejectRemark;
	}

	public Long getDynamicNumber() {
		return this.dynamicNumber;
	}

	public void setDynamicNumber(Long dynamicNumber) {
		this.dynamicNumber = dynamicNumber;
	}

}