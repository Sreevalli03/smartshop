package com.cognizant.smartshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.smartshop.model.User;
import com.cognizant.smartshop.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public User findByUsername(String name) {
		return userRepository.findByUsername(name);
	}

	@Transactional
	public List<User> adminData() {
		return userRepository.adminData();
	}

}
