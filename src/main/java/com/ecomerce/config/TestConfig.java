package com.ecomerce.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ecomerce.dominio.Categoria;
import com.ecomerce.dominio.Cliente;
import com.ecomerce.dominio.ItemPedido;
import com.ecomerce.dominio.Pagamento;
import com.ecomerce.dominio.Pedido;
import com.ecomerce.dominio.Produto;
import com.ecomerce.dominio.enums.PedidoStatus;
import com.ecomerce.repositorio.CategoriaRepositorio;
import com.ecomerce.repositorio.ClienteRepositorio;
import com.ecomerce.repositorio.ItemPedidoRepositorio;
import com.ecomerce.repositorio.PedidoRepositorio;
import com.ecomerce.repositorio.ProdutoRepositorio;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepositorio clienteRepositorio;

	@Autowired
	private PedidoRepositorio pedidoRepositorio;

	@Autowired
	private CategoriaRepositorio categoriaRepositorio;

	@Autowired
	private ProdutoRepositorio produtoRepositorio;
	
	@Autowired
	private ItemPedidoRepositorio itemPedidoRepositorio;

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
		Categoria cat18 = new Categoria(null, "SmartWatch");
		

		Produto prod1 = new Produto(null, "Feito de Rap", "ThugLife", "Camisa Estampada", "M", "Branca", 5, 30.00, "");
		Produto prod2 = new Produto(null, "Feito de Rap", "Peace", "Camisa Estampada", "P", "Branca", 10, 35.00, "");
		Produto prod3 = new Produto(null, "420Friends", "Snoopp", "Camisa Estampada", "G", "Verde", 20, 33.90, "");
		Produto prod4 = new Produto(null, "Pamonha Doce HS", "Manga Rosa",
				"Camisa com detalhes na manga e bolso nas costas", "M", "Branca", 40, 40.00, "");
		Produto prod5 = new Produto(null, "Diesel", "Square O'Clock", "Relógio quadrado, pulseira de metal",
				"Analógico", "Preto", 1, 800.00, "");
		Produto prod6 = new Produto(null, "Oakley", "HatBack", "Boné estampado", "M", "Preto", 5, 90.00, "");
		Produto prod7 = new Produto(null, "RayBan", "Aviator", "Óculos com armação de metal e lente polarizada",
				"Única", "Preto", 2, 400.00, "");
		Produto prod8 = new Produto(null, "BAW", "SholderHip", "SholderBag adaptativa para Pochete", "Único", "Preto",
				2, 150.00, "");
		Produto prod9 = new Produto(null, "Xiaomi", "GTR", "SmartWhatch", "Único", "Preto", 5, 900.00, "");

		categoriaRepositorio.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, cat9, cat10, cat11,
				cat12, cat13, cat14, cat15, cat16, cat17, cat18));
		produtoRepositorio.saveAll(Arrays.asList(prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9));

		prod1.getCategorias().add(cat1);
		prod2.getCategorias().add(cat1);
		prod3.getCategorias().add(cat1);
		prod4.getCategorias().add(cat1);
		prod5.getCategorias().add(cat14);
		prod6.getCategorias().add(cat6);
		prod7.getCategorias().add(cat15);
		prod8.getCategorias().add(cat8);
		prod8.getCategorias().add(cat9);

		produtoRepositorio.saveAll(Arrays.asList(prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8));

		Cliente cliente1 = new Cliente(null, "Beatriz", "Lopes", "beatrizlindona@gmail.com", "12345678910",
				"45996531452", "123456b");
		Cliente cliente2 = new Cliente(null, "Thales", "Lopes", "thalesmane@gmail.com", "23456789101", "45987523156",
				"123456t");
		//Cliente cliente3 = new Cliente(null, "Pollyana", "Xavier", "pollyxavier@gmail.com", "123456788101", "62984561582", "123456p");

		Pedido pedido1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), PedidoStatus.EMBALANDO, cliente1);
		Pedido pedido2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), PedidoStatus.ENTREGUE, cliente2);
		Pedido pedido3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), PedidoStatus.PERDIDO,
				cliente1);
		//Pedido pedido4 = new Pedido(null, Instant.parse("2019-02-11T04:20:05Z"), PedidoStatus.ENVIADO, cliente3);

		clienteRepositorio.saveAll(Arrays.asList(cliente1, cliente2));
		pedidoRepositorio.saveAll(Arrays.asList(pedido1, pedido2, pedido3));
		
		ItemPedido ip1 = new ItemPedido(pedido1, prod6, 2, prod6.getPreco(), 10.3);
		ItemPedido ip2 = new ItemPedido(pedido1, prod2, 1, prod2.getPreco(), 5.0);
		ItemPedido ip3 = new ItemPedido(pedido2, prod5, 1, prod5.getPreco(), 10.0);
		ItemPedido ip4 = new ItemPedido(pedido3, prod8, 1, prod8.getPreco(), 8.00);
		//ItemPedido ip5 = new ItemPedido(pedido4, prod4, 8, prod4.getPreco(), 12.00);
		//ItemPedido ip6 = new ItemPedido(pedido4, prod9, 2, prod9.getPreco(), 10.0);
		
		itemPedidoRepositorio.saveAll(Arrays.asList(ip1, ip2, ip3, ip4));
		
		Pagamento pag1 = new Pagamento(null, Instant.parse("2019-06-20T21:53:07Z"), pedido1);
		pedido1.setPagamento(pag1);
		
		pedidoRepositorio.save(pedido1);
		

	}

}
