package com.lti.scholarship.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.repository.GenericRepository;

@Service
public class InstituteLoginService {

	@Autowired
	private GenericRepository genericRepository;

	InstituteService instituteService;

	@Transactional
	public Boolean verifyInstitute(String instituteCode, String password) {
		Institute institute = (Institute) genericRepository.fetchInstituteByCode(Institute.class, instituteCode);
		Boolean flag = false;
		if (instituteCode.equals(institute.getInstituteName()) && password.equals(institute.getPassword())) {
			flag = true;
		}
		return flag;
	}
}
