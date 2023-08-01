package com.diet.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class StudentRegistationController {
	
	StudentRegistrationRepo repo;
	
	@PostMapping("/stu/reg")
	public String Registration(@RequestBody StudentRegistration stu) {
		
		StudentRegistration res = repo.save(stu);
		
		return "Student registered successfully..."+res.getName();
	}
	
}
