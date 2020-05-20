package com.ecomerce.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerce.dominio.Categoria;
import com.ecomerce.servicos.CategoriaServico;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaRecurso {
	
	@Autowired
	private CategoriaServico servico;
	
	// Listar todos os usuários 
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll() {
		List<Categoria> lista = servico.findAll();				
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id){
		Categoria obj = servico.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
