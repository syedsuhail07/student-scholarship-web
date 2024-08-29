package com.example.springweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonalController {

	@Autowired
	PersonalRepo repo;
	@RequestMapping("/")
	public String home() {
		return "home.html";
	}
	
	@RequestMapping("/submit-scholarship")
	public String scholarship(Personal personal) {
		repo.save(personal);
		return "home.html";
	}
}
