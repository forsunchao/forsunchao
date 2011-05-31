package com.chinasoft.sms.check.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Basicinfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Basicinfo implements java.io.Serializable {

	// Fields

	private Long staffNumber;
	private Departmentinfo departmentinfo;
	private String name;
	private String enname;
	private String password;
	private String personId;
	private Date birthday;
	private String nation;
	private String education;
	private String ismarried;
	private String department;
	private Long role;
	private String nameId;
	private String sex;
	private Set compactinfos = new HashSet(0);
	private Set checkparticularresultinfos = new HashSet(0);
	private Set checktableinfos = new HashSet(0);
    
	// Constructors

	/** default constructor */
	public Basicinfo() {
	}

	/** minimal constructor */
	public Basicinfo(String name, String password, String personId) {
		this.name = name;
		this.password = password;
		this.personId = personId;
	}

	/** full constructor */
	public Basicinfo(Departmentinfo departmentinfo, String name, String enname,
			String password, String personId,String nameId, Date birthday, String nation,
			String education, String ismarried, String department, Long role,
			String sex,Set compactinfos, Set checkparticularresultinfos,
			Set checktableinfos ) {
		this.departmentinfo = departmentinfo;
		this.name = name;
		this.enname = enname;
		this.password = password;
		this.personId = personId;
		this.birthday = birthday;
		this.nation = nation;
		this.education = education;
		this.ismarried = ismarried;
		this.department = department;
		this.role = role;
		this.compactinfos = compactinfos;
		this.checkparticularresultinfos = checkparticularresultinfos;
		this.checktableinfos = checktableinfos;
		this.nameId=nameId;
		this.sex=sex;
	}
	
	/** full constructor */
	public Basicinfo(Departmentinfo departmentinfo, String name, String enname,
			String password, String personId, Date birthday, String nation,
			String education, String ismarried, String department, Long role,
			Set compactinfos, Set checkparticularresultinfos,
			Set checktableinfos ) {
		this.departmentinfo = departmentinfo;
		this.name = name;
		this.enname = enname;
		this.password = password;
		this.personId = personId;
		this.birthday = birthday;
		this.nation = nation;
		this.education = education;
		this.ismarried = ismarried;
		this.department = department;
		this.role = role;
		this.compactinfos = compactinfos;
		this.checkparticularresultinfos = checkparticularresultinfos;
		this.checktableinfos = checktableinfos;
	
	}

	// Property accessors

	public Long getStaffNumber() {
		return this.staffNumber;
	}

	public void setStaffNumber(Long staffNumber) {
		this.staffNumber = staffNumber;
	}

	public Departmentinfo getDepartmentinfo() {
		return this.departmentinfo;
	}

	public void setDepartmentinfo(Departmentinfo departmentinfo) {
		this.departmentinfo = departmentinfo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnname() {
		return this.enname;
	}

	public void setEnname(String enname) {
		this.enname = enname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPersonId() {
		return this.personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getIsmarried() {
		return this.ismarried;
	}

	public void setIsmarried(String ismarried) {
		this.ismarried = ismarried;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Long getRole() {
		return this.role;
	}

	public void setRole(Long role) {
		this.role = role;
	}

	public Set getCompactinfos() {
		return this.compactinfos;
	}

	public void setCompactinfos(Set compactinfos) {
		this.compactinfos = compactinfos;
	}

	public Set getCheckparticularresultinfos() {
		return this.checkparticularresultinfos;
	}

	public void setCheckparticularresultinfos(Set checkparticularresultinfos) {
		this.checkparticularresultinfos = checkparticularresultinfos;
	}

	public Set getChecktableinfos() {
		return this.checktableinfos;
	}

	public void setChecktableinfos(Set checktableinfos) {
		this.checktableinfos = checktableinfos;
	}


	public String getNameId() {
		return nameId;
	}

	public void setNameId(String nameId) {
		this.nameId = nameId;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}