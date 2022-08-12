package com.springsecurity.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springsecurity.model.User;

@Service
public class UserServices {
	
	
	private static List<User> list = new ArrayList<User>();
	
	static {
		list.add(new User("abc1", "abc1", "abc1@gmail.com"));
		list.add(new User("abc2", "abc2", "abc2@gmail.com"));
		list.add(new User("abc3", "abc3", "abc3@gmail.com"));
	}
	
	// get All students
	public List<User> getAllUsers() {
		return this.list;
	}
	
	// get Single User
	public User getSingleUser(String username) {
		return this.list.stream().filter((student)->student.getUsername().equals(username)).findAny().orElse(null);
	}
	
	// add user
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
	
}
