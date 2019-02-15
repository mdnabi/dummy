package com.lti.scholarship.app.controller;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;

import com.lti.scholarship.app.repository.GenericRepository;

@Controller
public class InstituteLiginController {

	GenericRepository genericRepository;
	
	@Transactional
	public boolean verifyInstitute(String instituteName, String password) {
		System.out.println("service verifier called");
		return genericRepository.verify(instituteName, password);
	}
	
	
}
