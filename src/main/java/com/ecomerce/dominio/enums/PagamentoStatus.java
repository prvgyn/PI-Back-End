package com.ecomerce.dominio.enums;

public enum PagamentoStatus {
	
	PENDENTE(1),
	PAGO(2),
	CANCELADO(3);
	
	private int sit;
	
	private PagamentoStatus(int sit) {
		this.sit = sit;
	}
	
	public int getCode() {
		return sit;
	}
	
	public static PagamentoStatus valueOf(int sit) {
		for(PagamentoStatus value : PagamentoStatus.values()) {
			if(value.getCode() == sit) {
				return value;
			}
		}
		throw new IllegalArgumentException("Código de Status de Pagamento Inválido!");
	}
}
