package com.lti.scholarship.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.service.InstituteService;

@RestController
public class InstituteController {

	@Autowired
	private InstituteService instituteService;

	@RequestMapping(path = "/i")
	@CrossOrigin
	public String test() {
		return "Data added";
	}

	@RequestMapping(path = "/institute/add", method = RequestMethod.POST)
	@CrossOrigin
	public Institute add(@RequestBody Institute institute) {
		instituteService.add(institute);
		return institute;
	}

	@RequestMapping(path = "/institute/fetchByCode", method = RequestMethod.POST)
	@CrossOrigin
	public Institute fetchStateByInstituteCode(@RequestBody String instituteCode) {
		return instituteService.fetchStateByInstitueCode(instituteCode);
	}

	/*
	 * @RequestMapping(path = "/institute/fetchById", method = RequestMethod.POST)
	 * 
	 * @CrossOrigin public Student fetchStudentByAdharNo(Class<Student> clazz,String
	 * adharNo) {
	 * 
	 * return (Student)studentService.
	 * 
	 * }
	 */
	@RequestMapping(path = "/institute/fetchInstituteByInstituteCode", method = RequestMethod.POST)
	@CrossOrigin
	public Object fetchInstituteByCode(Class<Institute> clazz, String instituteCode) {
		return instituteService.fetchInstituteByCode(instituteCode);
	}

	@RequestMapping(path = "/institute/fetchStudentsByInstituteCode", method = RequestMethod.POST)
	@CrossOrigin
	public <E> List<Student> fetchAllByInstituteCode(Class<E> clazz, String instituteCode) {
		return instituteService.fetchStudentsByInstituteCode(instituteCode);
	}

	@RequestMapping(path = "/institute/fetchAll", method = RequestMethod.POST)
	@CrossOrigin
	public <E> List<E> fetchAll(Class<Institute> clazz) {
		return (List<E>) instituteService.fetchAll();
	}

}
