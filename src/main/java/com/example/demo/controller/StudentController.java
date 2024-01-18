package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.serveces.StudentServices;



@Controller
public class StudentController {
@Autowired
StudentServices srt;
	
	@GetMapping("/student")
public String fetchAllStudent(Model model) {
	model.addAttribute("student",srt.fetchAllStudent());
	return "viewstudent";
}
}
