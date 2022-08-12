package com.example.demo_1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo_1.model.User;
import com.example.demo_1.repository.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/all")
	public String home(Model model) {
		List<User> userList = userRepository.findAll();
		
		model.addAttribute("users", userList);
		return "home.html";
	}
	
	@GetMapping("/user/{id}")
	public String userProfile(@PathVariable Long id, Model model) {
		Optional<User> optionalUser = userRepository.findById(id);
		User user = optionalUser.get();
		model.addAttribute("user", user);
		return "userProfile.html";
		
	}
	
	
	

}
