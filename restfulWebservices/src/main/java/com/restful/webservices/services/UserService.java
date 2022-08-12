package com.restful.webservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restful.webservices.models.User;

@Service
public class UserService {
	
	private static List<User> userList;
	
	static  {
		userList.add(new User(1, "ram", "ram@gmail.com", "ram"));
		userList.add(new User(2, "sita", "sita@gmail.com", "sita"));
		userList.add(new User(3, "lakshman", "lakshman@gmail.com", "lakshman"));
	}
	
	public List<User> getAllUsers() {
		return userList;
	}
	
	public User save(User user) {
		userList.add(user);
		return user;
	}
	
	public User findById(int id) {
		return userList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
	}
}
