package com.lti.scholarship.app.interface1;

import com.lti.scholarship.app.entity.Institute;

public interface InstituteInterface {
	public Institute add(Institute institute);

	public Institute fetchById(int id);
}
