package com.ecomerce.servicos;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.ecomerce.dominio.Cliente;
import com.ecomerce.repositorio.ClienteRepositorio;
import com.ecomerce.servicos.exceptions.DatabaseException;
import com.ecomerce.servicos.exceptions.ResourceNotFoundException;

@Service
public class ClienteServico {

	@Autowired
	private ClienteRepositorio repository;

	public List<Cliente> findAll() {
		return repository.findAll();
	}

	public Cliente findById(Integer id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public Cliente inserir(Cliente obj) {
		return repository.save(obj);
	}

	public void apagar(Integer id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public Cliente atualizar(Integer id, Cliente obj) {
		try {
		Cliente entity = repository.getOne(id);
		atualizarData(entity, obj);
		return repository.save(entity);
		} catch(EntityNotFoundException e) {
			e.printStackTrace();
			throw new ResourceNotFoundException(id);
		}
	}

	private void atualizarData(Cliente entity, Cliente obj) {
		entity.setNome(obj.getNome());
		entity.setSobrenome(obj.getSobrenome());
		entity.setEmail(obj.getEmail());
		entity.setCpfOuCnpj(obj.getCpfOuCnpj());
		//entity.setSenha(obj.getSenha());
	}
}
