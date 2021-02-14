package org.kk.spring.boot.controller;

import java.util.Date;
import java.util.List;

import org.kk.spring.boot.model.User;
import org.kk.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping ("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping ("/")
	@ResponseBody
	public String viewHomePage() {
		return "index";
	}
	
	@RequestMapping ("/date")
	public String getDate(ModelMap map) {
		map.addAttribute("date", new Date());
		return "date";
	}
	@RequestMapping ("/register")
	public String registerPage(ModelMap map) {
		map.addAttribute("user", new User());
		return "singup_form";
	}

	@PostMapping ("/process_register")
	public String processRegister(@ModelAttribute User user) {
		 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		    String encodedPassword = passwordEncoder.encode(user.getPassword());
		    user.setPassword(encodedPassword);
		     
		    userService.saveUser(user);
		     
		    return "register_success";
	}
	
	@GetMapping ("/users")
	public String usersPage(ModelMap map) {
		List<User> listUsers = userService.getAllUser();
		map.addAttribute("listUser", listUsers);
		return "users";
	}
	
	@RequestMapping("/delete")
	public String deleteUser(@RequestParam Long userId) {
		userService.deleteUserById(userId);
		return "redirect:users";
	}
	@RequestMapping ("/getOne/{userId}")
	public String getOneStudent(@PathVariable Long userId, ModelMap map) throws Exception{
		User user = userService.getUserById(userId);
		map.addAttribute("getUser", user);
		return "user_view";
	}
	
	@RequestMapping (value = "/edit")
	public String editUserById(@RequestParam Long userId, ModelMap map) {
		userService.getUserById(userId);
		User user = userService.getUserById(userId);
		//From BACKING OBJECT
		map.addAttribute("user", user);
		return "edit_form";
	}
	
	@PostMapping ("/update")
	public String updateUser(@ModelAttribute User user) {
		userService.updateUser(user);
		return "redirect:users";
	}
	
}
