package com.adginfosys.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adginfosys.library.entiteis.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
