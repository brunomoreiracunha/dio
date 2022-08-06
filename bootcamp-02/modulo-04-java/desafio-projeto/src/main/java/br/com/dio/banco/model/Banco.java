package br.com.dio.banco.model;

import java.util.List;

public class Banco {
	
	private int numero;
	private String nome;
	private List<Agencia> agencias;
	
	public Banco(int numero, String nome, List<Agencia> agencias) {
		this.numero = numero;
		this.nome = nome;
		this.agencias = agencias;
	}
	
	public int getNumero() {
		return numero;
	}
	public String getNome() {
		return nome;
	}
	public List<Agencia> getAgencias() {
		return agencias;
	}

	@Override
	public String toString() {
		return "Banco [numero=" + numero + ", nome=" + nome + "] \r [ Agencias=" + agencias.toString() + "]";
	}
	
	
}
