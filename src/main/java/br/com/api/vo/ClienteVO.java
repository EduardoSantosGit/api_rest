package br.com.api.vo;

import java.util.Calendar;

import br.com.api.enums.StatusCliente;

public class ClienteVO {
	
	private String cpf;
	private String nome;
	private String dataNascimento;
	private String estadoCivil;
	private StatusCliente statusCliente;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public StatusCliente getStatusCliente() {
		return statusCliente;
	}
	public void setStatusCliente(StatusCliente statusCliente) {
		this.statusCliente = statusCliente;
	}
	
	

}
