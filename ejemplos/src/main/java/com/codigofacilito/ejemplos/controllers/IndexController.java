package com.codigofacilito.ejemplos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
	
	@GetMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("titulo", "Soy el titulo");
		model.addAttribute("saludo", "Hola a todos!");
		return "index";
	}
	
	@PostMapping(value = "/index-post")
	public String indexRequestMapping() {
		return "index";
	}
}
