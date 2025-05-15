package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

	@GetMapping
	public String hello() {
		return "<marquee>Hello World!</marquee>";
	}
	
	@GetMapping("/turma")
	public String turmaJava82() {
		return "<h1>A Turma Java 82 é TOP!</h1>";
	}
}
