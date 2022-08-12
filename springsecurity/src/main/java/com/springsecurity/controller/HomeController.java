package com.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/public")
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}
	
//	@PreAuthorize("hasRole('ADMIN')") // annotation to define only specified role can access the site
	@GetMapping("/login")
	public String login() {
		return "This is login page";
	}
	
	@GetMapping("/register")
	public String register() {
		return "This is register page";
	}
}
