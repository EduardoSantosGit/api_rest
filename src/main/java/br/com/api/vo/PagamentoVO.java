package br.com.api.vo;

public class PagamentoVO {
	
	private String forma_de_pagamento;
	private String valor;
	private String moeda;
	private String descricao;
	
	public String getForma_de_pagamento() {
		return forma_de_pagamento;
	}
	public void setForma_de_pagamento(String forma_de_pagamento) {
		this.forma_de_pagamento = forma_de_pagamento;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getMoeda() {
		return moeda;
	}
	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
