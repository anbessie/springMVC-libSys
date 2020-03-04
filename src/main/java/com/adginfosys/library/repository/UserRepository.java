package com.adginfosys.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adginfosys.library.entiteis.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findById(int id);
	//User findByUsername(String username);
}
