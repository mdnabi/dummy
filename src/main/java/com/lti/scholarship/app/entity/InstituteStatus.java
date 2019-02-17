package com.lti.scholarship.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_INSTITUTE_STATUS")
public class InstituteStatus {
	@Id
	@GeneratedValue
	private int record_id;

	@ManyToOne
	@JoinColumn(name = "instituteCode")
	private Institute institute;

	private String nameOfState;
	private String status;

	public Institute getInstitute() {
		return institute;

	}

	public void setInstitute(Institute institute) {
		this.institute = institute;
	}

	public String getNameOfState() {
		return nameOfState;
	}

	public void setNameOfState(String nameOfState) {
		this.nameOfState = nameOfState;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRecord_id() {
		return record_id;
	}

	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}

}
