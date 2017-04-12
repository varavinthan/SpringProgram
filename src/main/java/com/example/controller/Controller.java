package com.example.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {
	
	@Secured("ROLE_USER")
	@RequestMapping("/list")
	public String list(){
		return "******** list **********";
	}
	
	@Secured("ROLE_ADMIN")
	@RequestMapping("/add")
	public String add(){
		return "******** add list **********";
	}
	

}
