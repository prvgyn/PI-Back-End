package com.ecomerce.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerce.dominio.Cliente;
import com.ecomerce.repositorio.ClienteRepositorio;

@Service
public class ClienteServico {

	@Autowired
	private ClienteRepositorio repository;

	public List<Cliente> findAll() {
		return repository.findAll();
	}

	public Cliente findById(Long id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.get();
	}

	public Cliente inserir(Cliente obj) {
		return repository.save(obj);
	}
	
	public void apagar(Long id) {
		repository.deleteById(id);
	}
	
	public Cliente atualizar(Long id, Cliente obj) {
		Cliente entity = repository.getOne(id);
		atualizarData(entity, obj);
		return repository.save(entity);
	}

	private void atualizarData(Cliente entity, Cliente obj) {
		entity.setNome(obj.getNome());
		entity.setSobrenome(obj.getSobrenome());
		entity.setEmail(obj.getEmail());
		entity.setCpfOuCnpj(obj.getCpfOuCnpj());
		entity.setTelefone(obj.getTelefone());
		//entity.setSenha(obj.getSenha());
	}
}
