package br.com.dio.banco.model;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente, Agencia agencia) {
		super(cliente, agencia);
	}

	public void imprimirExtrato() {
		super.imprimirInfosComuns();
	}

}
