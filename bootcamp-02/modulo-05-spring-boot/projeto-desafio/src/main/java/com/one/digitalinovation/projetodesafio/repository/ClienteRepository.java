package com.one.digitalinovation.projetodesafio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.one.digitalinovation.projetodesafio.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
