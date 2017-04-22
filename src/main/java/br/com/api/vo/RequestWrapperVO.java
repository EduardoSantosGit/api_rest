package br.com.api.vo;

import java.util.List;

import br.com.api.enums.StatusCartao;

public class RequestWrapperVO {
	
	List<CartaoVO> cartao;
	PagamentoVO pagamento;
	StatusCartao statusCartao;
	
	public List<CartaoVO> getCartao() {
		return cartao;
	}
	public void setCartao(List<CartaoVO> cartao) {
		this.cartao = cartao;
	}
	public PagamentoVO getPagamento() {
		return pagamento;
	}
	public void setPagamento(PagamentoVO pagamento) {
		this.pagamento = pagamento;
	}
	public StatusCartao getStatusCartao() {
		return statusCartao;
	}
	public void setStatusCartao(StatusCartao statusCartao) {
		this.statusCartao = statusCartao;
	}
	
	
	
	

}
