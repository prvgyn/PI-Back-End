package com.ecomerce.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.ecomerce.dominio.Usuario;


public interface UsuarioRepositorio extends CrudRepository<Usuario, String>{

	Usuario findByLogin(String login);
}
