package com.lti.scholarship.app.interface1;

import java.util.List;

import com.lti.scholarship.app.entity.Institute;

public interface InstituteInterface {
	public Institute add(Institute institute);
	public Institute fetchInstituteByCode(String instituteName) ;
	public Institute fetchStateByInstitueCode(String instituteCode);	
}
