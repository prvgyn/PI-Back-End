package com.ecomerce.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerce.dominio.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteRecurso {
	
	// Listar todos os usuários 
	
	@GetMapping
	public ResponseEntity<Cliente> listarTodos() {
		Cliente cliente = new Cliente(1L, "Tarcisio", "Lopes", "tarcisiolopesgomes@gmail.com", "0153659746", "62999158371", "123456t");
		return ResponseEntity.ok().body(cliente);
	}
}
