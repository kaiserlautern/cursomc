package com.cesarfilho.cursomc.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import com.cesarfilho.cursomc.dominio.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento  implements Serializable {

	private static final long serialVersionUID = 1L;


	private Date dataVencimento;
	private Date dataPagamento;

	public PagamentoComBoleto() {}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date vencimento, Date pagamento) {
		super(id, estado, pedido);
		dataPagamento=pagamento;
		dataVencimento=vencimento;
		
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}


	
	 
}
