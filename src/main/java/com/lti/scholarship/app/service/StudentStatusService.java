package com.lti.scholarship.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.app.entity.StudentStatus;
import com.lti.scholarship.app.repository.GenericRepository;

@Service
public class StudentStatusService {
	@Autowired
	private GenericRepository genericRepository;
	@Autowired
	private StudentStatus studentStatus;

	@Transactional
	public void add(StudentStatus studentStatus) {
		System.out.println("service called");
		genericRepository.store(studentStatus);
	}

	@Transactional
	public String studentStatus(int userid, String instituteCode) {

		System.out.println("status @ service");
		boolean stauts = genericRepository.status(userid);
		if (stauts == true) {
			String uid = Integer.toString(userid);
			studentStatus.setAdharNo(uid);
			studentStatus.setInstituteCode(instituteCode);
			studentStatus.setStatus("yes");
			add(studentStatus);
		}
		return "";
	}
}
