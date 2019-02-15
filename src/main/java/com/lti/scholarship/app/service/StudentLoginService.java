package com.lti.scholarship.app.service;

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

	@Transactional
	public Boolean verify(String userid, String password) {
		Student student;
		System.out.println("verify @ service");
		boolean result = genericRepository.verify(userid, password);
		if (result = !true) {
			System.out.println("Sorry ..User Name or Password in correct");
		}
		
		return result;
	}

	@Transactional
	public boolean fetchByAdharAndPassword(String adhar, String password) {
		
		boolean result = genericRepository.fetchByAdharAndPassword(adhar, password);
		
		return result;
	}
	

}
