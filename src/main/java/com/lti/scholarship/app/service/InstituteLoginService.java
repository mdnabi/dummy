package com.lti.scholarship.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.repository.GenericRepository;

@Service
public class InstituteLoginService {

	@Autowired
	private GenericRepository genericRepository;

	@Transactional
	public Boolean verifyInstitute(String userid, String password) {
		Student student;
		System.out.println("verify @ service");
		boolean result = genericRepository.verifyInstitute(userid, password);
		if (result = !true) {
			System.out.println("Sorry ..InstituteName/Code or Password in correct");
		}
		return result;
	
	}
}
