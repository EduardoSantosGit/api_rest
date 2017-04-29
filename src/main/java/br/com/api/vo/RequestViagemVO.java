package br.com.api.vo;

import br.com.api.enums.StatusViagem;

public class RequestViagemVO {
	
	ClienteVO cliente;
	PagamentoVO pagamento;
	DestinoViagemVO destinoViagem;
	StatusViagem statusViagem;
	
	public ClienteVO getCliente() {
		return cliente;
	}
	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}
	public PagamentoVO getPagamento() {
		return pagamento;
	}
	public void setPagamento(PagamentoVO pagamento) {
		this.pagamento = pagamento;
	}
	public DestinoViagemVO getDestinoViagem() {
		return destinoViagem;
	}
	public void setDestinoViagem(DestinoViagemVO destinoViagem) {
		this.destinoViagem = destinoViagem;
	}
	public StatusViagem getStatusViagem() {
		return statusViagem;
	}
	public void setStatusViagem(StatusViagem statusViagem) {
		this.statusViagem = statusViagem;
	}
	
	

}
