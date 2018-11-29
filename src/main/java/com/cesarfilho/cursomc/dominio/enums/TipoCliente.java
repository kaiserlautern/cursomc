package com.cesarfilho.cursomc.dominio.enums;

public enum TipoCliente {
	
	PESSOAFISICA (1, "pessoa física"),
	PESSOAJURIDICA (2, "pessoa jurídica");

	Integer cod;
	String descricao;
	
	private TipoCliente(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) 
			return null;
		
		for(TipoCliente tc: TipoCliente.values()) {
			if(cod.equals(tc.getCod())) 
				return tc;
		}
		
		throw new IllegalArgumentException("Id inválido: "+ cod);
	}
	
}
