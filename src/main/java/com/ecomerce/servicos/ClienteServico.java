package com.ecomerce.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerce.dominio.Cliente;
import com.ecomerce.repositorio.ClienteRepositorio;


@Service
public class ClienteServico {
	
	@Autowired
	private ClienteRepositorio repository;
	
	public List<Cliente> findAll() {
		return repository.findAll();
	}
	
	public Cliente findById(Long id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.get();
	}
}
