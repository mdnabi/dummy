package com.lti.scholarship.app.controller;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;

import com.lti.scholarship.app.repository.GenericRepository;

@Controller
public class StudentLoginController {
	GenericRepository genericRepository;

	@Transactional
	public boolean verifyUser(String userName, String password) {
		System.out.println("service verifier called");
		return genericRepository.verify(userName, password);
	}

	@Transactional
	public boolean fetchByAdharAndPassword(String adhar, String password) {
		System.out.println("Adhar verifier @contorller");
		return genericRepository.fetchByAdharAndPassword(adhar, password);
	}
}
