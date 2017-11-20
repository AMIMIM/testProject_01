package com.adrian.project01.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Project: work in progress!";
	}
	
}
