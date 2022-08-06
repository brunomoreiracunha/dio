package br.com.dio.banco.model;

public abstract class Conta implements IConta {
	
	private static int SEQUENCIAL = 1;

	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected Agencia agencia;
	
	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public Agencia getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}

	public Conta(Cliente cliente, Agencia agencia) {
		this.agencia = agencia;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	private boolean verificarSaldo(double valor) {
		if(this.saldo >= valor) return true;
		else return false;
	}
	
	public void sacar(double valor) {
		if(verificarSaldo(valor)) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso da conta: "+this.numero);
		} else System.out.println("Saldo insuficiente para a operação.");
	
	}

	public void transferir(double valor, Conta contaDestino) {
		if(verificarSaldo(valor)) {
			this.saldo -= valor;
			contaDestino.depositar(valor);
		} else System.out.println("Saldo insuficiente para a transferencia.");
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	@Override
	public String toString() {
		return "\r Conta [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente.getNome()  + "]";
	}	
	
	
}
