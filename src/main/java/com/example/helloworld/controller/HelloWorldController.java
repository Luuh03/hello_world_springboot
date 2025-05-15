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

	// http://localhost:8080/hello/bsm
	@GetMapping("/bsm")
	public String bsm() {
		return "<h1>Lista de BSM's da Generation Brasil:</h1>"
				+ "<ul>"
				+ "<li>Mentalidade de Crescimento</li>"
				+ "<li>Orientação ao Futuro</li>"
				+ "<li>Persistência</li>"
				+ "<li>Responsabilidade Pessoal</li>"
				+ "</ul>";
	}
	
	// http://localhost:8080/hello/objetivos
	@GetMapping("/objetivos")
	public String objetivos() {
		return "<h1>Lista objetivos de aprendizagem da semana:</h1>"
				+ "<ul>"
				+ "<li>Escrever doc de anotações sobre pontos chave de MySQL</li>"
				+ "<li>Estudar mais sobre SpringBoot</li>"
				+ "<li>Escrever doc de anotações sobre SpringBoot</li>"
				+ "</ul>";
	}
}
