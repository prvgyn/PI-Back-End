package com.ecomerce.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerce.dominio.Pedido;
import com.ecomerce.repositorio.PedidoRepositorio;


@Service
public class PedidoServico {
	
	@Autowired
	private PedidoRepositorio repository;
	
	public List<Pedido> findAll() {
		return repository.findAll();
	}
	
	public Pedido findById(Integer id) {
		Optional<Pedido> obj = repository.findById(id);
		return obj.get();
	}
}
