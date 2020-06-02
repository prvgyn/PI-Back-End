package com.ecomerce.security;

import org.springframework.security.core.userdetails.UserDetailsService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.ecomerce.dominio.Usuario;
import com.ecomerce.repositorio.UsuarioRepositorio;

@Repository
@Transactional
public class ImplementsUserDetailsService implements UserDetailsService{

	@Autowired
	private UsuarioRepositorio ur;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Usuario usuario = ur.findByLogin(login);
		
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario não encontrado");
		}
		return new User(usuario.getUsername(), usuario.getPassword(), true, true, true, true, usuario.getAuthorities());
	}
}
