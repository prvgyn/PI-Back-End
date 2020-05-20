package com.ecomerce.dominio.enums;

public enum PedidoStatus {
	
	AGUARDANDO_PAGAMENTO(1), 
	PAGO(2), 
	EMBALANDO(3),
	ENVIADO(4),
	ENTREGUE(5),
	CANCELADO(6),
	DEVOLVIDO(7),
	PERDIDO(8);
	
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
