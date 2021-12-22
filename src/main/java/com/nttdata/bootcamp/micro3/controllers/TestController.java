package com.nttdata.bootcamp.micro3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/micro3")
public class TestController {

	@GetMapping(path="/helloWorld")
	public String helloWorld() {
		return "Hello Word";
	}
	
}
