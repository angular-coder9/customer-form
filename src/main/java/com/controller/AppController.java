package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/")
	public String startApp() {
		return "Hello starter";
	}

	@GetMapping("/user")
	public String user() {
		return "Hello user";
	}

	@GetMapping("/admin")
	public String admin() {
		return "Hello admin";
	}

}