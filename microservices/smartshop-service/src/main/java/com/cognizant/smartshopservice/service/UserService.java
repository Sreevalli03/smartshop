package com.cognizant.smartshopservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.smartshopservice.model.User;
import com.cognizant.smartshopservice.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public User findByUsername(String name) {
		return userRepository.findByUsername(name);
	}

	@Transactional
	public List<User> adminDetails() {
		return userRepository.adminDetails();
	}

	/*
	 * public List<User> response(User user) { // TODO Auto-generated method
	 * stub userRepository.save(user); }
	 */

}
