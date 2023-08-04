package br.com.spring.cursosb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@GetMapping(path = {"/ola", "/saudacao"})
	public String Ola() {
		return "Olá, Spring Boot!";
	}

}
