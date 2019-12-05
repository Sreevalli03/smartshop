package com.cognizant.smartshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.smartshop.model.User;
import com.cognizant.smartshop.service.AppUserDetailsService;
import com.cognizant.smartshop.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	AppUserDetailsService appUserDetailsService;

	@PostMapping("/U")
	public String signupUser(@RequestBody User userlist) {
		return appUserDetailsService.signupUser(userlist);
	}

	@PostMapping("/A")
	public String signupAdmin(@RequestBody User userlist) {
		return appUserDetailsService.signupAdmin(userlist);
	}

	@GetMapping("/adminrequest")
	public List<User> adminData() {
		return userService.adminData();
	}

	@PutMapping("")
	public void response(@RequestBody User user) {
		appUserDetailsService.response(user);
	}

}
