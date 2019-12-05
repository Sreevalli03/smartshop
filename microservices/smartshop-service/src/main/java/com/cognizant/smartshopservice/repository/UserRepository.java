package com.cognizant.smartshopservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.smartshopservice.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("FROM User u where u.userId=?1")
	public User findByUsername(String name);

	/*
	 * @Query("Select u from User u where u.userId=?1") User getMenuItems(String
	 * username);
	 */

	@Query("select u from User u join u.roleList r where r.name='admin'")
	List<User> adminDetails();

	@Query("From User u where u.contactNumber=?1")
	public User findByContactNumber(String contact);

}
