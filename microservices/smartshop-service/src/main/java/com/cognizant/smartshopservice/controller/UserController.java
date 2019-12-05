package com.cognizant.smartshopservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.smartshopservice.model.User;
import com.cognizant.smartshopservice.service.AppUserDetailsService;
import com.cognizant.smartshopservice.service.UserService;

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
	public List<User> adminDetails() {
		return userService.adminDetails();
	}

	@PutMapping("")
	public void response(@RequestBody User user) {
		appUserDetailsService.response(user);
	}

}
