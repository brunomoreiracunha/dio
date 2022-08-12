package com.one.digitalinovation.projetodesafio.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.one.digitalinovation.projetodesafio.model.Cliente;
import com.one.digitalinovation.projetodesafio.model.Endereco;
import com.one.digitalinovation.projetodesafio.repository.ClienteRepository;
import com.one.digitalinovation.projetodesafio.repository.EnderecoRepository;
import com.one.digitalinovation.projetodesafio.service.ClienteService;
import com.one.digitalinovation.projetodesafio.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	EnderecoRepository enderecoRepository;
	@Autowired
	ViaCepService viaCepService;
	
	@Override
	public Iterable<Cliente> buscarTodosCliente() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarClientePorId(Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		if(cliente.isPresent()) return cliente.get();
		else return null;
	}

	@Override
	public void adicionarCliente(Cliente cliente) {
		salvarCliente(cliente);
		
	}

	@Override
	public void atualizarCliente(Long id, Cliente cliente) {
		Optional<Cliente> novoCliente = clienteRepository.findById(id);
		if (novoCliente.isPresent()) {
			salvarCliente(cliente);
		}
		
	}

	@Override
	public void deletarCliente(Long id) {
		clienteRepository.deleteById(id);		
	}
	
	private void salvarCliente(Cliente cliente) {
		
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {	
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		
		cliente.setEndereco(endereco);
		clienteRepository.save(cliente);
	}
	
}
