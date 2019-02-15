package com.lti.scholarship.app.controller;

import javax.servlet.GenericServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.scholarship.app.entity.Scholarship;
import com.lti.scholarship.app.service.ScholarshipService;

@RestController
public class ScholarshipController {
	ScholarshipService scholarshipService;

	@Autowired
	private GenericServlet genericServlet;

	@RequestMapping(path = "/scholarship/add", method = RequestMethod.POST)
	@CrossOrigin
	public String add(@RequestBody Scholarship scholarship) {
		scholarshipService.add(scholarship);
		return "record added successfully";
	}

}
