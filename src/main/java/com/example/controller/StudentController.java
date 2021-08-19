package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.StudentResponse;

@RestController
@RequestMapping("/api/student/")
public class StudentController {

	@Value("${app.name:Default Demo App}")
	private String appName;
	
	@GetMapping("/get")
	//@RequestMapping(value = "/get", method = RequestMethod.GET)
	public StudentResponse getStudent () {
		StudentResponse studentResponse = new StudentResponse(1, "John", "Smith");
		return studentResponse;
	}
}
