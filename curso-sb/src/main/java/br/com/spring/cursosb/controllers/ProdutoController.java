package br.com.spring.cursosb.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.cursosb.model.entities.Produto;
import br.com.spring.cursosb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	private ProdutoRepository produtoRepository;

	@PostMapping
	public @ResponseBody Produto novoProduto(@RequestParam String nome) {
		Produto produto = new Produto(nome);
		produtoRepository.save(produto);
		return produto;
	}
}
