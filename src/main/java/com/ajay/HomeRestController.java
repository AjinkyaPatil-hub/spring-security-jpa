package com.ajay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

	
	@GetMapping(value="/")
	public String home() {
		return ("<h1>Wellcome to the Spring Security Home</h1>");
	}

	//only avaliable to user
	@GetMapping(value="/user")
	public String user() {
		return ("<h1>Wellcome User...</h1>");
	}

	//only avaliable to the admin
	@GetMapping(value="/admin")
	public String admin() {
		return ("<h1>Wellcome Admin...</h1>");
	}

}
