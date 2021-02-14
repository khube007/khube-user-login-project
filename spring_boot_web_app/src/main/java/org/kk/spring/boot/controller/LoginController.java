package org.kk.spring.boot.controller;

import org.kk.spring.boot.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@GetMapping ("/")
	public String displayLogin(ModelMap map) {
		map.addAttribute("login", new Login());
		return "login";
	}

	@RequestMapping (value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute ("login") Login login, BindingResult result) {
		return "login";
	}
	
}
