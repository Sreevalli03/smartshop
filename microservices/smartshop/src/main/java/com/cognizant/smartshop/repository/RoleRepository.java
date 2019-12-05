package com.cognizant.smartshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.smartshop.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String string);

}
