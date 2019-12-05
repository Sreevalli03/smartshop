package com.cognizant.smartshop.service;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.smartshop.SmartshopApplication;
import com.cognizant.smartshop.model.Role;
import com.cognizant.smartshop.model.User;

import com.cognizant.smartshop.repository.RoleRepository;
import com.cognizant.smartshop.repository.UserRepository;
import com.cognizant.smartshop.security.AppUser;

@Service
public class AppUserDetailsService implements UserDetailsService {
	private static final Logger LOGGER = LoggerFactory.getLogger(SmartshopApplication.class);

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findByUsername(username);
		if (user.getUserId() == null) {
			throw new UsernameNotFoundException("User is not found");
		}

		else if (user.getStatus().equals("P")) {
			throw new UsernameNotFoundException("Status of manager is pending");
		}

		else {
			AppUser app = new AppUser(user);
			System.out.println(app);
			return app;
		}

	}

	@Transactional
	public String signupUser(User user) {
		User username = userRepository.findByUsername(user.getUserId());
		if (username != null) {
			// throw new UserAlreadyExistsException();
			return "false";
		} else {
			Set<Role> roleList = new HashSet<>();
			roleList.add(roleRepository.findById(1).get());
			user.setRoleList(roleList);
			user.setUserType("U");
			user.setStatus("A");
			user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
			userRepository.save(user);
			return "true";
		}
	}

	@Transactional
	public String signupAdmin(User user) {
		User username = userRepository.findByUsername(user.getUserId());
		if (username != null) {
			// throw new UserAlreadyExistsException();
			return "false";
		} else {
			Set<Role> roleList = new HashSet<>();
			roleList.add(roleRepository.findById(2).get());
			user.setRoleList(roleList);
			user.setUserType("A");
			user.setStatus("P");
			user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
			userRepository.save(user);
			return "true";
		}
	}

	public void response(User user) {
		userRepository.save(user);
	}
}
