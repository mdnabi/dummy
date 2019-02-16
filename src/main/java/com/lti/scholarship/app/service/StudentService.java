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

		return (Student) genericRepository.store(student);
	}

	@Transactional
	public Student fetchByAdharNo(String adrNo) {
		System.out.println("student service");
		return  genericRepository.fetchStudentByAdharNo(Student.class,adrNo);
	}

	@Transactional
	public List<Student> fetchAll() {
		// System.out.flush();
		return genericRepository.fetchAll(Student.class);
	}
	
	@Transactional
	public Boolean verify(String userName,String password) {
	 
		List<Student> students = fetchAll();
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
	}

	@Override
	public Student fetchById(int id) {
		
		return null;
	}
			

	
	
}
