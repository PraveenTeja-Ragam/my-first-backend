package com.diet.api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<DietUser ,String>{
	
}

