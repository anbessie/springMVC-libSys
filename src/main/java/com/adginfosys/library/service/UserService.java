package com.adginfosys.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adginfosys.library.entiteis.User;

@Service

public interface UserService {

	void saveUser(User user);

	List<User> getAll();

	User getUser(int id);

	void deleteUser(int id);

}
