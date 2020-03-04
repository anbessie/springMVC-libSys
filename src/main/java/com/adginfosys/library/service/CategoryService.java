package com.adginfosys.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adginfosys.library.entiteis.Category;

@Service

public interface CategoryService {

	

	 List<Category> getAll();

}
