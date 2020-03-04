package com.adginfosys.library.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.adginfosys.library.entiteis.User;
import com.adginfosys.library.repository.UserRepository;
import com.adginfosys.library.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encreptedPassword = encoder.encode(user.getPassword());
		user.setPassword(encreptedPassword);
		userRepository.save(user);
		
	}

	@Override
	public List<User> getAll() {
		
		return userRepository.findAll();
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public void deleteUser(int id) {
		
		User user = userRepository.findById(id);
		userRepository.delete(user);
	}

}
