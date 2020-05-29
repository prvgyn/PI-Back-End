package com.ecomerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomerce.dominio.Cliente;


@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
	
	
}
