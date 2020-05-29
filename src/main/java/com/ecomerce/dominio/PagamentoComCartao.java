package com.ecomerce.dominio;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ecomerce.dominio.enums.PagamentoStatus;

@Entity
@Table(name = "tb_pagamentoCartao")
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Integer numeroDeParcelas;

	public PagamentoComCartao() {
	}

	public PagamentoComCartao(Integer id, PagamentoStatus estado, Pedido pedido, Integer numeroDeParcelas) {
		super();
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

}
