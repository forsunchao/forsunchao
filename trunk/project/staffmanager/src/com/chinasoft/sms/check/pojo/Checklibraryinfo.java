package com.chinasoft.sms.check.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Checklibraryinfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Checklibraryinfo implements java.io.Serializable {

	// Fields

	private Long checklibraryId;
	private String checklibraryType;
	private String checklibraryContent;
	private Set dynamicinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Checklibraryinfo() {
	}

	/** minimal constructor */
	public Checklibraryinfo(Long checklibraryId) {
		this.checklibraryId = checklibraryId;
	}

	/** full constructor */
	public Checklibraryinfo(Long checklibraryId, String checklibraryType,
			String checklibraryContent, Set dynamicinfos) {
		this.checklibraryId = checklibraryId;
		this.checklibraryType = checklibraryType;
		this.checklibraryContent = checklibraryContent;
		this.dynamicinfos = dynamicinfos;
	}

	// Property accessors

	public Long getChecklibraryId() {
		return this.checklibraryId;
	}

	public void setChecklibraryId(Long checklibraryId) {
		this.checklibraryId = checklibraryId;
	}

	public String getChecklibraryType() {
		return this.checklibraryType;
	}

	public void setChecklibraryType(String checklibraryType) {
		this.checklibraryType = checklibraryType;
	}

	public String getChecklibraryContent() {
		return this.checklibraryContent;
	}

	public void setChecklibraryContent(String checklibraryContent) {
		this.checklibraryContent = checklibraryContent;
	}

	public Set getDynamicinfos() {
		return this.dynamicinfos;
	}

	public void setDynamicinfos(Set dynamicinfos) {
		this.dynamicinfos = dynamicinfos;
	}

}