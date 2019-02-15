package com.lti.scholarship.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_STUDENTSTATUS")
public class StudentStatus {
@Id
	private String adharNo;
	private String instituteCode;
	private String status;
	
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String userid) {
		this.adharNo = userid;
	}
	public String getInstituteCode() {
		return instituteCode;
	}
	public void setInstituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
