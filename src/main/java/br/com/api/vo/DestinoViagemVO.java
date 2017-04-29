package br.com.api.vo;

import java.math.BigDecimal;

public class DestinoViagemVO {
	
	
	private Integer codidoDestino;
	private String nomeDestino;
	private BigDecimal qtdDiasViagem;
	
	public Integer getCodidoDestino() {
		return codidoDestino;
	}
	public void setCodidoDestino(Integer codidoDestino) {
		this.codidoDestino = codidoDestino;
	}
	public String getNomeDestino() {
		return nomeDestino;
	}
	public void setNomeDestino(String nomeDestino) {
		this.nomeDestino = nomeDestino;
	}
	public BigDecimal getQtdDiasViagem() {
		return qtdDiasViagem;
	}
	public void setQtdDiasViagem(BigDecimal qtdDiasViagem) {
		this.qtdDiasViagem = qtdDiasViagem;
	}
	
	

}
