package com.sb.github.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String demo() {
		return "Hello Spring boot";
	}
	
}
