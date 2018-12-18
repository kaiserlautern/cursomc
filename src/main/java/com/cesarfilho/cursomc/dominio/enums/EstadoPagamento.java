package com.cesarfilho.cursomc.dominio.enums;

public enum EstadoPagamento {

	PENDENTE(1, "pagamento pendente"), 
	QUITADO(2, "pagamento quitado"), 
	CANCELADO(3,"pagamento cancelado");
	
	private Integer codigo;
	private String descricao;
	
	private EstadoPagamento(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer codigo) {
		if(codigo == null) 
			return null;
		
		for (EstadoPagamento estado : EstadoPagamento.values()) {
			if(estado.getCodigo().equals(codigo)) 
				return estado;
		}
		throw new IllegalArgumentException("Id inválido: "+ codigo);
	}
}
