package com.cesarfilho.cursomc.dominio;

import java.io.Serializable;

import javax.persistence.Entity;

import com.cesarfilho.cursomc.dominio.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento  implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numParcelas) {
		super(id, estado, pedido);
		numeroDeParcelas = numParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}


	
}
