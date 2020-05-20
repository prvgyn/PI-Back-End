package com.ecomerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomerce.dominio.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long>{
	
	
}
