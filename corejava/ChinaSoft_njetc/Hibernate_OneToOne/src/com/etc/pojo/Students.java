package com.etc.pojo;

/**
 * Book entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Students implements java.io.Serializable {

	// Fields

	private String bookId;
	private String bookName;
	private String bookDesc;

	// Constructors

	/** default constructor */
	public Students() {
	}

	/** full constructor */
	public Students(String bookName, String bookDesc) {
		this.bookName = bookName;
		this.bookDesc = bookDesc;
	}

	// Property accessors

	public String getBookId() {
		return this.bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookDesc() {
		return this.bookDesc;
	}

	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}

}