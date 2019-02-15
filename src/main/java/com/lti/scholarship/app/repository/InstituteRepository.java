package com.lti.scholarship.app.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;

@Repository
public class InstituteRepository extends GenericRepository {

	// @PersistenceContext //To create object of EntityManager
	private GenericRepository genericRepository;

	@Transactional
	public void add(Institute institute) {
		genericRepository.store(institute);
	}

	@Transactional
	public Institute fetchById(int id) {
		return (Institute) genericRepository.fetchById(Institute.class, id);
	}

	@Transactional
	public List<Institute> fetchAllByInstituteId(String instituteId) {
		return genericRepository.fetchAllByInstituteId(Institute.class, instituteId);
	}

	@Transactional
	public List<Institute> fetchAll() {
		return genericRepository.fetchAll(Institute.class);
	}

}
