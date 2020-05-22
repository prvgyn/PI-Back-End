package com.ecomerce.dominio.enums;

public enum ClienteTipo {
	
	FÍSICA(1),
	JURÍDICA(2);
	
	private int tipo;
	
	private ClienteTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getCode() {
		return tipo;
	}
	
	public static ClienteTipo valueOf(int tipo) {
		for(ClienteTipo value : ClienteTipo.values()) {
			if(value.getCode() == tipo) {
				return value;
			}
		}
		throw new IllegalArgumentException("Código de Tipo Cliente Inválido!");
	}
}
