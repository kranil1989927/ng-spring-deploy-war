package com.learn.spring.angular.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/app")
	public String home() {
		return "index";
	}
}
