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
		System.out.println(institute);
		instituteService.add(institute);
		return institute;
	}

	@RequestMapping(path = "/institute/fetchById", method = RequestMethod.POST)
	@CrossOrigin
	public Institute fetchById(@RequestBody int id) {
		return instituteService.fetchById(id);
	}

	@RequestMapping(path = "/institute/fetchStudentsByInstituteId", method = RequestMethod.POST)
	@CrossOrigin
	public List<Student> fetchStudentsByInstituteId(@RequestBody String instituteId) {
		return instituteService.fetchStudentsByInstituteId(instituteId);
	}
	/*@RequestMapping(path = "/institute/fetchInstituteIdBystudentId", method = RequestMethod.POST)
	@CrossOrigin
	public Institute fetchInstituteIdBystudentId(@RequestBody int id) {
		return instituteService.fetchInstituteByStudentId(id);
	}*/

}
