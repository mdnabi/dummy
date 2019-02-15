package com.lti.scholarship.app.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.scholarship.app.entity.Student;

@Repository
public class StudentRepository extends GenericRepository {

	// @PersistenceContext //To create object of EntityManager
	private GenericRepository genericRepository;

	@Transactional
	public void add(Student student) {
		genericRepository.store(student);
	}

	@Transactional
	public Student fetchById(int id) {
		return (Student) genericRepository.fetchById(Student.class, id);
	}

	@Transactional
	public Boolean verify(String userName, String password) {
		return genericRepository.verify(userName, password);
	}

}
