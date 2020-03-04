package com.adginfosys.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adginfosys.library.entiteis.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
