package com.example.springweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InternshipController {

	
	@Autowired
	InternshipRepo repo;
	
	@RequestMapping("/submit-education")
	public String education(Internship internship) {
		repo.save(internship);
		return "internship.html";
	}
}
