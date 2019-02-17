package com.lti.scholarship.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.repository.GenericRepository;

@Service
public class StudentLoginService {
	@Autowired
	private GenericRepository genericRepository;
	StudentService studentService;

	@Transactional
	public Boolean verifyByUser(String adharNo, String password) {
		Boolean flag = false;
		Student student = genericRepository.fetchStudentByAdharNo(Student.class, adharNo);

		if (adharNo.equals(student.getAdharNo()) && password.equals(student.getPassword())) {
			flag = true;
		}
		return flag;
	}

}
