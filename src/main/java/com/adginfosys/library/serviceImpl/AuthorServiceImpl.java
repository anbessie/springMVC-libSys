package com.adginfosys.library.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adginfosys.library.entiteis.Author;
import com.adginfosys.library.repository.AuthorRepository;
import com.adginfosys.library.service.AuthorService;
@Service

public class AuthorServiceImpl implements AuthorService {
    @Autowired
	AuthorRepository authorRepository;
	@Override
	public List<Author> getAll() {
		// TODO Auto-generated method stub
		return authorRepository.findAll();
	}
	@Override
	public void saveAuthor(Author author) {
		
		authorRepository.save(author);
	}
	@Override
	public Author getAuthor(int id) {
		// TODO Auto-generated method stub
		return authorRepository.findById(id).orElse(null);
	}
	@Override
	public void delete(int id) {
		Author author = authorRepository.findById(id).orElse(null);
		authorRepository.delete(author);
		
	}
	

}
