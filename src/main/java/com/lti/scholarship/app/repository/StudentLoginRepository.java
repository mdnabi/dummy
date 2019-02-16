package com.lti.scholarship.app.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.entity.StudentLogin;
import com.lti.scholarship.app.service.StudentService;

@Repository
public class StudentLoginRepository extends GenericRepository {

	GenericRepository genericRepository;
	StudentLogin studentLogin;
	StudentService studentService;

	@Transactional
	public Boolean verifyStudent(String userName, String password) {
		List<Student> students = studentService.fetchAll();
		boolean flag = false;
		for (Student student : students) {
			if (userName.equals(student.getName()) & password.equals(student.getPassword())) {
				flag = true;
			}
		}
		if (flag == true) {
			System.out.println("LoginSuccessFull...!");
			System.out.println("Welcome...!" + userName);
		}
		if (flag == false) {
			System.out.println("Sorry ..User Name or Password in correct");
		}
		return (Boolean)flag;

		/*
		 * List<Student> students=genericRepository.fetchAll(Student.class); boolean
		 * flag=false; for(Student student:students) {
		 * if(user.equals(studentLogin.getUserName())&&pwd.equals(studentLogin.
		 * getPassword())) flag=true; } return flag; }
		 */
	}
}
