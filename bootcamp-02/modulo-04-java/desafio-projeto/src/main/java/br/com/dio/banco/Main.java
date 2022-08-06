package br.com.dio.banco;

import java.util.ArrayList;
import java.util.List;

import br.com.dio.banco.model.Agencia;
import br.com.dio.banco.model.Banco;
import br.com.dio.banco.model.Cliente;
import br.com.dio.banco.model.Conta;
import br.com.dio.banco.model.ContaCorrente;
import br.com.dio.banco.model.ContaPoupanca;
import br.com.dio.banco.model.Endereco;
import br.com.dio.banco.model.Telefone;
import br.com.dio.banco.model.TipoEndereco;
import br.com.dio.banco.model.TipoTelefone;

public class Main {
	
	public static void main(String[] args) {
		
		//CRIANDO AS AGENCIAS E AS POPULANDO
		Agencia agencia1 = new Agencia("MG - Psy");
		agencia1.setContas(carregarDados(agencia1));
		
		Agencia agencia2 = new Agencia("SP - Psy");
		agencia2.setContas(carregarDados(agencia2));
		
		//CRIANDO O BANCO E ADICIONANDO AS AGENCIAS
		List<Agencia> listaAgencia = new ArrayList<Agencia>();
		listaAgencia.add(agencia1);
		listaAgencia.add(agencia2);
		Banco banco = new Banco(123, "Banco Psy Investment", listaAgencia);
		
		//MOSTANDO O  BANCO
		System.out.println(banco.toString());
		
		//DEPOSITANDO
		banco.getAgencias().get(0).getContas().get(0).depositar(1000);
		banco.getAgencias().get(0).getContas().get(1).depositar(1000);
		banco.getAgencias().get(1).getContas().get(0).depositar(1000);
		banco.getAgencias().get(1).getContas().get(1).depositar(1000);
		
		//SAQUES E TESTE NO SAQUE SEM VALOR
		banco.getAgencias().get(1).getContas().get(0).sacar(500);
		banco.getAgencias().get(1).getContas().get(0).sacar(500);
		banco.getAgencias().get(1).getContas().get(0).sacar(100);
		
		//TRANSFERENCIAS E TESTE SEM VALOR
		banco.getAgencias().get(0).getContas().get(0).transferir(500, banco.getAgencias().get(0).getContas().get(1));
		banco.getAgencias().get(0).getContas().get(0).transferir(500, banco.getAgencias().get(0).getContas().get(1));
		banco.getAgencias().get(0).getContas().get(0).transferir(100, banco.getAgencias().get(0).getContas().get(1));
		
		//MOSTANDO O BANCO APOS ALTERACOES
		System.out.println(banco.toString());
	}
	
	static List<Conta> carregarDados(Agencia agencia){
		
		List<Conta> listaContas = new ArrayList<Conta>();
		
		for(int i=1; i<=4; i++) {
			Cliente cliente = new Cliente();
			
			cliente.setNome("Usuario - "+i);
			cliente.setCpf("123456");
			
			Endereco endereco = new Endereco();
			endereco.setCidade("Cidade - "+i);
			endereco.setEstado("Estado - "+i);
			endereco.setBairro("Bairro - "+i);
			endereco.setRua("Rua - "+i);
			endereco.setNumero("1234");
			if(i<=2) endereco.setTipo(TipoEndereco.RESIDENCIAL);
			else endereco.setTipo(TipoEndereco.PROFESSIONAL);
			
			cliente.setEndereco(endereco);
			
			Telefone telefone = new Telefone();
			telefone.setNumero("(34)91234-1234");
			if(i>=3) telefone.setTipo(TipoTelefone.CELULAR);
			else telefone.setTipo(TipoTelefone.TELEFONE_FIXO);
			
			cliente.setTelefone(telefone);
			
			if(i <= 2) {
				ContaCorrente cc = new ContaCorrente(cliente, agencia);
				listaContas.add(cc);
			}else {
				ContaPoupanca cp = new ContaPoupanca(cliente, agencia);
				listaContas.add(cp);
			}
		}		
		return listaContas;
	}
}
