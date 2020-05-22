package com.ecomerce.dominio.enums;

public enum PedidoStatus {
	
	EMBALANDO(1),
	ENVIADO(2),
	ENTREGUE(3),
	DEVOLVIDO(4),
	PERDIDO(5);
	
	private int code;
	
	private PedidoStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static PedidoStatus valueOf(int code) {
		for(PedidoStatus value : PedidoStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Código de Status de Pedido Inválido!");
	}
}
