package com.springboot.security.springbootsecurity.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloResource {
	
	@GetMapping("/home")
	public String home() {
		return "<h2>Hello Home</h2>";
	}
	@GetMapping("/user")
	public String getUser() {
		return "<h2>Hello User</h2>";
	}
	@GetMapping("/admin")
	public String getAdmin() {
		return "<h2>Hello Admin</h2>";
	}

}
