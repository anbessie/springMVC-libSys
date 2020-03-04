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
import com.adginfosys.library.entiteis.Role;
import com.adginfosys.library.entiteis.User;
import com.adginfosys.library.entiteis.Author;
import com.adginfosys.library.service.AuthorService;
import com.adginfosys.library.service.BookService;
import com.adginfosys.library.service.RoleService;
import com.adginfosys.library.service.UserService;

@Controller
public class AuthorController {
	@Autowired
	AuthorService authorService;
	@Autowired
	BookService bookService;
	
	@GetMapping("/authors")
   public String Authors(Model model) {
		
		 List<Author> authors =  authorService.getAll();
		 
		 model.addAttribute("authors", authors);
		 
		return "author/all";
   }
	@GetMapping("/authors/new")
	   public String newAuthor(Model model) {
		Author author = new Author();
			
			
			model.addAttribute("author", author);
			
			model.addAttribute("title", "Add New Author");
			
		   return "author/new";
	   }
	@PostMapping("/authors/createorupdate")
	public String createOrUpdate(Author author, Model model) {
		authorService.saveAuthor(author);
		 List<Author> authors =  authorService.getAll();
		 
		 model.addAttribute("authors", authors);
		 
		return "author/all";
	}
	@GetMapping("/authors/edit/{id}")
	public String update(@PathVariable("id") int id, Model model) {
		Author author = authorService.getAuthor(id);
		 
		 
		 model.addAttribute("author", author);
		 
			model.addAttribute("books", bookService.getAll());
		 
		 model.addAttribute("title", "Edit Author");
		return "author/new";
	}
	@GetMapping("/authors/delete/{id}")
	public String deleteAuthor(@PathVariable("id") int id, Model model) {
		authorService.delete(id);
		 List<Author> authors = authorService.getAll();
		 
		 
		 model.addAttribute("author", authors);
		 
		 model.addAttribute("title", "Delete Author");
		return "author/new";
	}
	

}
