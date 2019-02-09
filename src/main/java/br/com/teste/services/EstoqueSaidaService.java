package br.com.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.models.EstoqueSaida;
import br.com.teste.repositories.EstoqueSaidaRepository;

@Service
public class EstoqueSaidaService {

	@Autowired
	EstoqueSaidaRepository repository;
	
	public EstoqueSaida create(EstoqueSaida estoqueSaida) {
		return repository.save(estoqueSaida);
	}
	
	public EstoqueSaida readId(Long id) {
		return repository.findById(id).get();
	}
	
	public List<EstoqueSaida> readAll(){
		return repository.findAll();
	}
	
	public EstoqueSaida update(EstoqueSaida estoqueSaida) {
		if (repository.existsById(estoqueSaida.getId())) 
		{	return repository.save(estoqueSaida);
		}
		return null;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
