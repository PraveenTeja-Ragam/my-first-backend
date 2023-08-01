package com.diet.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DietUserController {
	@Autowired
	UserRepo repo;
	
	@PostMapping("/user/add")
	public String addNewUser(@RequestBody DietUser user) {
		
		
		DietUser res = repo.save(user);
		
		return "successfully added the new user- "+res.getUserName();
	}
}
