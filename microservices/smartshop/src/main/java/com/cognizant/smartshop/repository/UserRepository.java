package com.cognizant.smartshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.smartshop.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("FROM User u where u.userId=?1")
	public User findByUsername(String name);

	@Query("select u from User u join u.roleList r where r.name='admin'")
	List<User> adminData();

}
