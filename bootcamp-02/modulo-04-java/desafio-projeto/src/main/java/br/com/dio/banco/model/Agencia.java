package br.com.dio.banco.model;

import java.util.List;

public class Agencia {
	
	private static int SEQUENCIAL = 1;
	
	private int numero;
	private String nome;
	private List<Conta> contas;
	
	public Agencia(String nome) {
		this.nome = nome;
		this.numero = SEQUENCIAL++;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Conta> getContas() {
		return contas;
	}

	@Override
	public String toString() {
		return "\r Agencia [numero=" + numero + ", nome=" + nome +
			   "\r Contas: " + contas.toString() + " ]";
	}
	
}
