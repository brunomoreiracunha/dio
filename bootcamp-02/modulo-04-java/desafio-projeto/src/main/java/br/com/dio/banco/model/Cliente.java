package br.com.dio.banco.model;

public class Cliente {
	
	private static int SEQUENCIAL = 1;
	
	private int id;
	private String nome;
	private String cpf;
	private Telefone telefone;
	private Endereco endereco;
	
	public Cliente() {
		this.id = SEQUENCIAL++;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
