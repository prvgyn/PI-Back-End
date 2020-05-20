package com.ecomerce.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ecomerce.dominio.Cliente;
import com.ecomerce.repositorio.ClienteRepositorio;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ClienteRepositorio clienteRepositorio;

	@Override
	public void run(String... args) throws Exception {
		Cliente cliente1 = new Cliente(null, "Beatriz", "Lopes", "beatrizlindona@gmail.com", "12345678910", "45996531452", "123456b");
		Cliente cliente2 = new Cliente(null, "Thales", "Lopes", "thalesmane@gmail.com", "23456789101", "45987523156", "123456t");
		
		clienteRepositorio.saveAll(Arrays.asList(cliente1, cliente2));
		
	}
	
	
}
