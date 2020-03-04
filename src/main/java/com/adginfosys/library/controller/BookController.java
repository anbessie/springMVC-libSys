package com.adginfosys.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adginfosys.library.entiteis.Author;
import com.adginfosys.library.entiteis.Book;
import com.adginfosys.library.entiteis.Category;
import com.adginfosys.library.entiteis.Role;
import com.adginfosys.library.service.AuthorService;
import com.adginfosys.library.service.BookService;
import com.adginfosys.library.service.CategoryService;

@Controller

public class BookController {
	@Autowired
	BookService bookService;
	@Autowired
	AuthorService authorService;
	@Autowired
	CategoryService categoryService;
	@GetMapping("/books")
	public String getAll(Model model) {
		
		List<Book> books = bookService.getAll();
		model.addAttribute("books", books);
		return "/book/all";
	}
	@GetMapping("/books/new")
	public String newbook(Model model) {
		
		
		model.addAttribute("book",  new Book());
		model.addAttribute("authors", authorService.getAll());
		model.addAttribute("categorys", categoryService.getAll());
		model.addAttribute("title", "Add New Book");
		return "/book/new";
	}
	@PostMapping("/books/createorupdate")
	public String createOrUpdate(Book book, Model model) {
		bookService.saveOrUpdate(book);
		
		List<Book> books = bookService.getAll();
		model.addAttribute("books", books);
		return "/book/all";
	}
	@GetMapping("books/edit/{isbn}")
public String editbook(@PathVariable("isbn") String isbn, Model model) {
		Book book = bookService.getBook(isbn);
		
		model.addAttribute("book",  book);
		model.addAttribute("authors", authorService.getAll());
		model.addAttribute("categorys", categoryService.getAll());
		model.addAttribute("title", "Add New Book");
		return "/book/new";
	}
	@GetMapping("/books/delete/{isbn}")
	public String delete(@PathVariable("isbn") String isbn,Model model) {
		
        bookService.delete(isbn); 
		
		List<Book> books = bookService.getAll();
		model.addAttribute("books", books);
		return "/book/all";
	}
	@GetMapping("books/search")
	public String viewBook(Model model) {
		List<Book> books = bookService.getAllBooks();
		model.addAttribute("books", books);
		return "book/search";
	}
	}


