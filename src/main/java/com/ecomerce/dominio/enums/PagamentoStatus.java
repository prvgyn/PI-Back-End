package com.ecomerce.dominio.enums;

public enum PagamentoStatus {

	PENDENTE(1), PAGO(2), CANCELADO(3);

	private Integer code;

	private PagamentoStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static PagamentoStatus toEnum(Integer code) {
		if (code == null) {
			return null;
		}
		for (PagamentoStatus x : PagamentoStatus.values()) {
			if (code.equals(x.getCode())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Código de Status de Pagamento inválido " + code);

	}
}