package com.ecomerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomerce.dominio.ItemPedido;

public interface ItemPedidoRepositorio extends JpaRepository<ItemPedido, Long>{
	
	
}
