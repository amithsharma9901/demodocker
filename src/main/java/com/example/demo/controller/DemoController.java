package com.example.demo.controller;
import jakarta.servlet.http.*;

import java.util.*;
import com.example.demo.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class DemoController {

	private List<Student> students=new ArrayList<>(List.of(new Student("amith"),new Student("anil")));
	
	@GetMapping("/one")
	public String getAns(HttpServletRequest ht) {
		return "hello there "+ht;
	}
	@GetMapping("/two")
	public List<Student> getStudent() {
		return students;
	}
	@PostMapping("/three")
	public List<Student> saveStudent(Student student) {
		students.add(student);
		return students;
	}
	
	
//	@GetMapping("/token")
//	public CsrfToken sharma(HttpServletRequest h) {
//		return (CsrfToken) h.getAttribute("_csrf");//cross site request frogery
//	}
	
	
	
}
