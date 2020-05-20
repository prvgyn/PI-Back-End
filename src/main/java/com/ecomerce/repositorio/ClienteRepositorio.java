package com.ecomerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomerce.dominio.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{
	
	
}
