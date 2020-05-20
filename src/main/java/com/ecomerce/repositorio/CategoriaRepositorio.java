package com.ecomerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomerce.dominio.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long>{
	
	
}
