package com.lti.scholarship.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.interface1.StudentInterface;
import com.lti.scholarship.app.repository.GenericRepository;

@Service
public class StudentService implements StudentInterface {

	@Autowired
	private GenericRepository genericRepository;

	@Transactional
	public Student add(Student student) {

		return genericRepository.stores(student);
	}

	@Transactional
	public Student fetchById(int id) {
		return (Student) genericRepository.fetchById(Student.class, id);
	}

	@Transactional
	public List<Student> fetchAll() {
		// System.out.flush();
		return genericRepository.fetchAll(Student.class);
	}
	

}
