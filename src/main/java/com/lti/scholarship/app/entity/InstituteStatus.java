package com.lti.scholarship.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_INSTITUTESTATUS")
public class InstituteStatus {
	@Id
	private String instituteCode;
	private String StateName;
	private String InstituteStatus;
	
	
	public InstituteStatus() {
		super();
	}
	public String getInstituteCode() {
		return instituteCode;
	}
	public void setInstituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
	}
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	public String getInstituteStatus() {
		return InstituteStatus;
	}
	public void setInstituteStatus(String instituteStatus) {
		InstituteStatus = instituteStatus;
	}

	
}
