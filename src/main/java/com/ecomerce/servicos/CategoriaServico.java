package com.ecomerce.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerce.dominio.Categoria;
import com.ecomerce.repositorio.CategoriaRepositorio;


@Service
public class CategoriaServico {
	
	@Autowired
	private CategoriaRepositorio repository;
	
	public List<Categoria> findAll() {
		return repository.findAll();
	}
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.get();
	}
}
