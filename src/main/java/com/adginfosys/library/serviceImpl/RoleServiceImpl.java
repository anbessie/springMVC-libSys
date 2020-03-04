package com.adginfosys.library.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adginfosys.library.entiteis.Role;
import com.adginfosys.library.repository.RoleRepository;
import com.adginfosys.library.service.RoleService;
@Service

public class RoleServiceImpl implements RoleService {
   @Autowired
   RoleRepository roleRepository;
	@Override
	public List<Role> getAllRolls() {
		return roleRepository.findAll();
	}
	@Override
	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

}
