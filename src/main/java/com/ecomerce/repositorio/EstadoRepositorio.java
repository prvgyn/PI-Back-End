package com.ecomerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomerce.dominio.Estado;

@Repository
public interface EstadoRepositorio extends JpaRepository<Estado, Integer>{	
	
}
