package br.com.spring.cursosb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.spring.cursosb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}

