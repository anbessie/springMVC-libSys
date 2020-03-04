package com.adginfosys.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adginfosys.library.entiteis.Book;

@Service

public interface BookService {

	List<Book> getAll();

	void saveOrUpdate(Book book);

	Book getBook(String isbn);

	void delete(String isbn);

	List<Book> getAllBooks();

}
