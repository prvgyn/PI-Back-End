package com.ecomerce.dominio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import com.ecomerce.dominio.enums.PagamentoStatus;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class PagamentoComCartao extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Integer numeroparcelas;
	private Double juros;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, PagamentoStatus pagamentoStatus,Integer numeroparcelas, Double juros) {
		super();
		this.numeroparcelas = numeroparcelas;
		this.juros = juros;
	}

	public Integer getNumeroparcelas() {
		return numeroparcelas;
	}

	public void setNumeroparcelas(Integer numeroparcelas) {
		this.numeroparcelas = numeroparcelas;
	}

	public Double getJuros() {
		return juros;
	}

	public void setJuros(Double juros) {
		this.juros = juros;
	}
	
	
	
	
}
