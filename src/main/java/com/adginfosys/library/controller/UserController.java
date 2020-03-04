package com.adginfosys.library.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.adginfosys.library.entiteis.Role;
import com.adginfosys.library.entiteis.User;
import com.adginfosys.library.service.RoleService;
import com.adginfosys.library.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	RoleService roleService;
	
	@GetMapping("/users")
   public String Users(Model model) {
		
		 List<User> users =  userService.getAll();
		 
		 model.addAttribute("users", users);
		 
		return "user/all";
   }
	@GetMapping("/users/new")
	   public String newUser(Model model) {
			User user = new User();
			List<Role> roles= roleService.getAllRolls();
			
			model.addAttribute("user", user);
			model.addAttribute("roles", roles);
			model.addAttribute("title", "Add New User");
			
		   return "user/new";
	   }
	@PostMapping("/users/createorupdate")
	public String createOrUpdate(User user, Model model) {
		 userService.saveUser(user);
		 List<User> users =  userService.getAll();
		 
		 model.addAttribute("users", users);
		 
		return "user/all";
	}
	@GetMapping("/users/edit/{id}")
	public String update(@PathVariable("id") int id, Model model) {
		 User user = userService.getUser(id);
		 List<Role> roles =  roleService.getAllRoles();
		 
		 model.addAttribute("user", user);
		 model.addAttribute("roles", roles);
		 model.addAttribute("title", "Edit User");
		return "user/new";
	}
	@GetMapping("/users/delete/{id}")
	public String delete(@PathVariable("id") int id, Model model) {
		  userService.deleteUser(id);
		  
		 List<User> users =  userService.getAll();
		 
		 model.addAttribute("users", users);
		 
		 
		return "user/all";
	}
}
