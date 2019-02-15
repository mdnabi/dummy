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
		return genericRepository.store(institute);
	}
//To Fetch student by id
	@Transactional
	public Institute fetchById(int id) {
		return (Institute) genericRepository.fetchById(Institute.class, id);
	}
//To 
	@Transactional
	public List<Student> fetchStudentsByInstituteId(String instututeId) {

		return genericRepository.fetchAllByInstituteId(Institute.class, instututeId);

	}

	@Transactional
	public List<Institute> fetchAll() {

		return genericRepository.fetchAll(Institute.class);

	}
	@Transactional
	public Institute fetchInstituteByStudentId(int sid) {
		return  (Institute) genericRepository.fetchInstituteByStudentId(sid);
	}

}
