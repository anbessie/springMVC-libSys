package com.adginfosys.library.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adginfosys.library.entiteis.Book;
import com.adginfosys.library.repository.BookRepository;
import com.adginfosys.library.service.BookService;
@Service

public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;
	@Override
	public List<Book> getAll() {
		
		List<Book> books = bookRepository.findAll();
		//if books not equal to null, and books is not empty return books.
		//if(books != null & !books.isEmpty()) 
			//return books;
		
		
		
		return books;
	}
	@Override
	public void saveOrUpdate(Book book) {
		bookRepository.save(book);
		
	}
	@Override
	public Book getBook(String isbn) {
	
		return bookRepository.findById(isbn).orElse(null);
	}
	@Override
	public void delete(String isbn) {
		Book book = bookRepository.findById(isbn).orElse(null);
		if( book != null)
		bookRepository.delete(book);
	}
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

}
