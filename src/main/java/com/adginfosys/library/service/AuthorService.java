package com.adginfosys.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adginfosys.library.entiteis.Author;

@Service

public interface AuthorService {

	List<Author> getAll();

	void saveAuthor(Author author);

	Author getAuthor(int id);

	void delete(int id);

}
