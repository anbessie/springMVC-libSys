package com.adginfosys.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adginfosys.library.entiteis.Role;

@Service

public interface RoleService {

	List<Role> getAllRolls();

	List<Role> getAllRoles();

}
