package com.lti.scholarship.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.entity.StudentStatus;
import com.lti.scholarship.app.repository.GenericRepository;

@Service
public class StudentStatusService {
	
	@Autowired
	private GenericRepository genericRepository;
	
	@Transactional
	public void add(StudentStatus studentStatus) {
		System.out.println("service called");
		genericRepository.store(studentStatus);
	}

	@Transactional
	public void studentStatus(String adNo, String instituteCode) {
		Student s = genericRepository.fetchStudentByAdharNo(Student.class, adNo);
		Institute i = genericRepository.fetchStateByInstituteCode(Institute.class, instituteCode);
		
		StudentStatus ss = new StudentStatus();
		ss.setInstitute(i);
		ss.setStudent(s);
		ss.setStatus("yes");
		
		genericRepository.store(ss);
	}
}
