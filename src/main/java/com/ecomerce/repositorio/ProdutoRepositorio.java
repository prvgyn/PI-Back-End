package com.ecomerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomerce.dominio.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {

}
