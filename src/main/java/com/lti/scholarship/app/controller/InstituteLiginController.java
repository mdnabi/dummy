package com.lti.scholarship.app.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.repository.GenericRepository;
import com.lti.scholarship.app.service.InstituteService;

@Controller
public class InstituteLiginController {

	GenericRepository genericRepository;
	InstituteService instituteService;

	@Transactional
	public Boolean verifyInstitute(String instituteName, String password) {
		List<Institute> institutes = instituteService.fetchAll();
		Boolean flag = false;
		for (Institute institutet : institutes) {
			if (instituteName.equals(institutet.getInstituteName()) & password.equals(institutet.getPassword())) {
				flag = true;
			}
		}
		return flag;
	}

}
