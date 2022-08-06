package br.com.dio.banco.model;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Agencia agencia) {
		super(cliente, agencia);
		
	}

	public void imprimirExtrato() {
		super.imprimirInfosComuns();
	}
}
