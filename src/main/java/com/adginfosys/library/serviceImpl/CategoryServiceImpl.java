package com.adginfosys.library.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adginfosys.library.entiteis.Category;
import com.adginfosys.library.repository.CategoryRepository;
import com.adginfosys.library.service.CategoryService;
@Service

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}
