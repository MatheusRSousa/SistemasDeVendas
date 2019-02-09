package br.com.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.teste.models.EstoqueEntrada;
import br.com.teste.repositories.EstoqueEntradaRepository;

@Service
public class EstoqueEntradaService {

	@Autowired
	EstoqueEntradaRepository repository;
	
	public EstoqueEntrada create(EstoqueEntrada estoqueEntrada) {
		return repository.save(estoqueEntrada);
	}
	
	public EstoqueEntrada readId(Long id) {
		return repository.findById(id).get();
	}
	
	public List<EstoqueEntrada> readAll(){
		return repository.findAll();
	}
	
	public EstoqueEntrada update(EstoqueEntrada estoqueEntrada) {
		if (repository.existsById(estoqueEntrada.getId())) 
		{	return repository.save(estoqueEntrada);
		}
		return null;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
