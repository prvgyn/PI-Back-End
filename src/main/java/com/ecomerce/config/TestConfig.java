package com.ecomerce.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ecomerce.dominio.Cliente;
import com.ecomerce.dominio.Pedido;
import com.ecomerce.repositorio.ClienteRepositorio;
import com.ecomerce.repositorio.PedidoRepositorio;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	@Autowired
	private PedidoRepositorio pedidoRepositorio;

	@Override
	public void run(String... args) throws Exception {
		Cliente cliente1 = new Cliente(null, "Beatriz", "Lopes", "beatrizlindona@gmail.com", "12345678910", "45996531452", "123456b");
		Cliente cliente2 = new Cliente(null, "Thales", "Lopes", "thalesmane@gmail.com", "23456789101", "45987523156", "123456t");
		
		Pedido pedido1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), cliente1);
		Pedido pedido2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), cliente2);
		Pedido pedido3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), cliente1);
		
		clienteRepositorio.saveAll(Arrays.asList(cliente1, cliente2));
		pedidoRepositorio.saveAll(Arrays.asList(pedido1, pedido2, pedido3));
		
	}
	
	
}
