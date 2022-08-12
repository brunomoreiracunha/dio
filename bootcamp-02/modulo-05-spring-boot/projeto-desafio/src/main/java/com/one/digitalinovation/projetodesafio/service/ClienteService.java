package com.one.digitalinovation.projetodesafio.service;

import com.one.digitalinovation.projetodesafio.model.Cliente;

public interface ClienteService {
	
	Iterable<Cliente> buscarTodosCliente();
	
	Cliente buscarClientePorId(Long id);
	
	void adicionarCliente(Cliente cliente);
	
	void atualizarCliente(Long id, Cliente cliente);
	
	void deletarCliente(Long id);
}
