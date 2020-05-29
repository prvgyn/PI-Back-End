package com.ecomerce.dominio.enums;

public enum PedidoStatus {
	
	EMBALANDO(1),
	ENVIADO(2),
	ENTREGUE(3),
	DEVOLVIDO(4),
	PERDIDO(5);
	
	private Integer code;
	
	private PedidoStatus(Integer code) {
		this.code = code;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public static PedidoStatus toEnum(Integer code) {
		if (code == null) {
			return null;
		}
		for (PedidoStatus x : PedidoStatus.values()) {
			if (code.equals(x.getCode())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Código de Status de Pagamento inválido " + code);

	}
}
