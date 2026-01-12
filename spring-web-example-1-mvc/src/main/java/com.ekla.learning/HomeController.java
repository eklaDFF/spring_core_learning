package com.ekla.learning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/hello")
	public String sayHello(Model model){
		model.addAttribute("msg", "Hello Spring MVC");
		return "hello"; // resolves to hello.jsp
	}
}