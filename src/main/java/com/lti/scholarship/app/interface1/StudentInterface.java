package com.lti.scholarship.app.interface1;

import java.util.List;

import com.lti.scholarship.app.entity.Student;

public interface StudentInterface {

	public Student add(Student student);

	public Boolean verify(String userName, String password);

	public Student fetchByAdharNo(String adrNo);

}
