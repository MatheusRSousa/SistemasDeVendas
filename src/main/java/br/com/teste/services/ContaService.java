package br.com.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.models.Conta;
import br.com.teste.repositories.ContaRepository;

@Service
public class ContaService {

	@Autowired
	ContaRepository repository;
	
	public Conta create(Conta conta) {
		return repository.save(conta);
	}
	
	public Conta readId(Long id) {
		return repository.findById(id).get();
	}
	
	public List<Conta> readAll(){
		return repository.findAll();
	}
	
	public Conta update(Conta conta) {
		if (repository.existsById(conta.getId())) 
		{	return repository.save(conta);
		}
		return null;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
