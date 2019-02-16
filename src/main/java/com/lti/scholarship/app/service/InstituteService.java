package com.lti.scholarship.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.interface1.InstituteInterface;
import com.lti.scholarship.app.repository.GenericRepository;

@Service
public class InstituteService implements InstituteInterface {

	@Autowired
	private GenericRepository genericRepository;
//to store Student data in to  Database(Student table)
	@Transactional
	public Institute add(Institute institute) {
		return (Institute) genericRepository.store(institute);
	}
//To Fetch student by id
	@Transactional
	public Institute fetchByCode(String code) {
		return (Institute) genericRepository.fetchAllByInstituteCode(Institute.class, code);
	}
	@Transactional
	public Institute fetchInstituteByName(String instituteName) {
		return (Institute) genericRepository.fetchInstituteByName(Institute.class, instituteName);
	}
	@Transactional
	public Institute fetchStateByInstitueCode(String instituteCode) {
		System.out.println("in service");
		return genericRepository.fetchStateByInstituteCode(Institute.class,instituteCode);
		 
	};
//To 
	@Transactional
	public List<Student> fetchStudentsByInstituteId(String instututeId) {

		return genericRepository.fetchAllByInstituteCode(Institute.class, instututeId);

	}
	@Transactional
	public List<Student> fetchStudentsByInstituteCode(String instututeId) {
		 
		return genericRepository.fetchAllByInstituteCode(Institute.class, instututeId);

	}
	
	@Transactional
	public List<Institute> fetchAll() {
		List<Institute> institutes= genericRepository.fetchAll(Institute.class);
		return institutes;
	}
	
	@Override
	public Institute fetchById(int id) {
		//Delete later
		return null;
	}

}
