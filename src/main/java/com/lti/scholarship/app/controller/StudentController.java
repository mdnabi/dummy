package com.lti.scholarship.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(path = "/s")
	@CrossOrigin
	public String test() {
		return "Data added";
	}

	@RequestMapping(path = "/student/add", method = RequestMethod.POST)
	@CrossOrigin
	public String add(@RequestBody Student student) {
		studentService.add(student);
		return "record added successfully";
	}

	@RequestMapping(path = "/student/fetchByAdharNo", method = RequestMethod.POST)
	@CrossOrigin
	public Student fetchStudentByAdharNo(String adharno) {
		return studentService.fetchByAdharNo(adharno);
	}

	@RequestMapping(path = "/student/fetchAll", method = RequestMethod.POST)
	@CrossOrigin
	public List<Student> fetchAll(@RequestBody Student student) {
		List<Student> lst = studentService.fetchAll();
		for (Student st : lst) {
			System.out.println(st);
		}
		return lst;
	}
}
