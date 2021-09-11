package com.Jagadeesh.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jagadeesh.entity.Users;
import com.Jagadeesh.service.UserService;
@RestController


public class UserController {
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/allUsers")
	public List<Users> getAllUsers(){
		return userService.getAllUsers();
}
}
