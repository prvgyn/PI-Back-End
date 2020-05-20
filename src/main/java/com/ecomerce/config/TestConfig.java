package com.ecomerce.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ecomerce.dominio.Categoria;
import com.ecomerce.dominio.Cliente;
import com.ecomerce.dominio.Pedido;
import com.ecomerce.dominio.enums.PedidoStatus;
import com.ecomerce.repositorio.CategoriaRepositorio;
import com.ecomerce.repositorio.ClienteRepositorio;
import com.ecomerce.repositorio.PedidoRepositorio;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	@Autowired
	private PedidoRepositorio pedidoRepositorio;
	
	@Autowired
	private CategoriaRepositorio categoriaRepositorio;
	

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Camisas");
		Categoria cat2 = new Categoria(null, "Camisetas");
		Categoria cat3 = new Categoria(null, "Regatas");
		Categoria cat4 = new Categoria(null, "Bermudas");
		Categoria cat5 = new Categoria(null, "Shorts");
		Categoria cat6 = new Categoria(null, "Bonés");
		Categoria cat7 = new Categoria(null, "Meias");
		Categoria cat8 = new Categoria(null, "Sholderbags");
		Categoria cat9 = new Categoria(null, "Pochetes");
		Categoria cat10 = new Categoria(null, "Mochilas");
		Categoria cat11 = new Categoria(null, "Tênis");
		Categoria cat12 = new Categoria(null, "Pulseiras");
		Categoria cat13 = new Categoria(null, "Anéis");
		Categoria cat14 = new Categoria(null, "Relógios");
		Categoria cat15 = new Categoria(null, "Óculos");
		Categoria cat16 = new Categoria(null, "Bolsas");
		Categoria cat17 = new Categoria(null, "Calças");
		

		Cliente cliente1 = new Cliente(null, "Beatriz", "Lopes", "beatrizlindona@gmail.com", "12345678910", "45996531452", "123456b");
		Cliente cliente2 = new Cliente(null, "Thales", "Lopes", "thalesmane@gmail.com", "23456789101", "45987523156", "123456t");
		
		Pedido pedido1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), PedidoStatus.PAGO, cliente1);
		Pedido pedido2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), PedidoStatus.ENTREGUE, cliente2);
		Pedido pedido3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), PedidoStatus.AGUARDANDO_PAGAMENTO, cliente1);
		
		
		clienteRepositorio.saveAll(Arrays.asList(cliente1, cliente2));
		pedidoRepositorio.saveAll(Arrays.asList(pedido1, pedido2, pedido3));
		categoriaRepositorio.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, cat9, cat10, cat11, cat12, cat13, cat14, cat15, cat16, cat17));
		
	}
	
	
}
