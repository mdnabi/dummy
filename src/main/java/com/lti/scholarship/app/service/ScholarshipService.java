package com.lti.scholarship.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.app.entity.Scholarship;
import com.lti.scholarship.app.repository.GenericRepository;

@Service
public class ScholarshipService {

	@Autowired
	private GenericRepository genericRepository;

	@Transactional
	public void add(Scholarship scholarship) {
		System.out.println("service called");
		genericRepository.store(scholarship);
	}
}
