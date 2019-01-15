package ua.online.courses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {


	@GetMapping("/")
	public String showHome(Model model) {
		
		return "home";
	}

	@GetMapping("/info")
	public String userInfo(Model model) {
		
		return "info";
	}
	


}
