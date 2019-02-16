package com.lti.scholarship.app.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.InstituteStatus;
import com.lti.scholarship.app.repository.GenericRepository;

@Service
public class InstituteStatusService {
	GenericRepository genericRepository;
	
	
	
	@Transactional
	public void instituteStatus(String instituteCode,String status) {
		Institute institute=genericRepository.fetchStateByInstituteCode(Institute.class, instituteCode);
		InstituteStatus is=new InstituteStatus();
		is.setInstitute(institute);
		is.setStatus(status);
		is.setNameOfState((String)institute.getStateOfInstitute());
		genericRepository.store(is);
		
		
	}	
}
