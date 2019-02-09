package br.com.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.models.TipoUnidade;
import br.com.teste.repositories.TipoUnidadeRepository;

@Service
public class TipoUnidadeService {

	@Autowired
	TipoUnidadeRepository repository;
	
	public TipoUnidade create(TipoUnidade tipoUnidade) {
		return repository.save(tipoUnidade);
	}
	
	public TipoUnidade readId(Long id) {
		return repository.findById(id).get();
	}
	
	public List<TipoUnidade> readAll(){
		return repository.findAll();
	}
	
	public TipoUnidade update(TipoUnidade tipoUnidade) {
		if (repository.existsById(tipoUnidade.getId())) 
		{	return repository.save(tipoUnidade);
		}
		return null;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
