package br.com.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.models.Categoria;
import br.com.teste.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository repository;
	
	public Categoria create(Categoria categoria) {
		return repository.save(categoria);
	}
	
	public Categoria readId(Long id) {
		return repository.findById(id).get();
	}
	
	public List<Categoria> readAll(){
		return repository.findAll();
	}
	
	public Categoria update(Categoria categoria) {
		if (repository.existsById(categoria.getId())) 
		{	return repository.save(categoria);
		}
		return null;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
