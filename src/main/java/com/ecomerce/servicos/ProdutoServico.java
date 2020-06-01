package com.ecomerce.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerce.dominio.Produto;
import com.ecomerce.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {

	@Autowired
	private ProdutoRepositorio repository;

	public List<Produto> findAll() {
		return repository.findAll();
	}

	public Produto findById(Integer id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.get();
	}
}
