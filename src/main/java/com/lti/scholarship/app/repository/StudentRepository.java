package com.lti.scholarship.app.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.service.StudentService;

@Repository
public class StudentRepository extends GenericRepository {

	// @PersistenceContext //To create object of EntityManager
	private GenericRepository genericRepository;
StudentService studentService;
	@Transactional
	public void add(Student student) {
		genericRepository.store(student);
	}

	@Transactional
	public Student fetchStudentByAdharNo(String adharno) {
		Student student= genericRepository.fetchStudentByAdharNo(Student.class,adharno);
		return student;
	}

	@Transactional
	public Boolean verify(String adharNo, String password) {
		List<Student>students = studentService.fetchAll();
		boolean flag = false;
		for (Student student : students) {

			if (adharNo.equals(student.getAdharNo()) & password.equals(student.getPassword())) {
				flag = true;
			}
		}
		return flag;
	}

}
