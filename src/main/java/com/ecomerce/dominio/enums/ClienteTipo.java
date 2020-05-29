package com.ecomerce.dominio.enums;

public enum ClienteTipo {
	
	FISICA(1),
	JURIDICA(2);
	
	private Integer code;
	
	private ClienteTipo(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static ClienteTipo toEnum(Integer code) {
		if (code == null) {
			return null;
		}
		for (ClienteTipo x : ClienteTipo.values()) {
			if (code.equals(x.getCode())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Código de Cliente inválido " + code);

	}
}
