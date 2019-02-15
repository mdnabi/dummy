package com.lti.scholarship.app.repository;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.scholarship.app.entity.StudentLogin;

@Repository
public class StudentLoginRepository extends GenericRepository {

	GenericRepository genericRepository;
	StudentLogin studentLogin;

	@Transactional
	public Boolean verify(String userid, String password) {

		System.out.println("repository verifiver");
		return genericRepository.verify(userid, password);

		/*
		 * List<Student> students=genericRepository.fetchAll(Student.class); boolean
		 * flag=false; for(Student student:students) {
		 * if(user.equals(studentLogin.getUserName())&&pwd.equals(studentLogin.
		 * getPassword())) flag=true; } return flag; }
		 */
	}
}
