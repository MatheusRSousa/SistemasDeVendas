package br.com.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.models.Produto;
import br.com.teste.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository repository;
	
	public Produto create(Produto produto) {
		return repository.save(produto);
	}
	
	public Produto readId(Long id) {
		return repository.findById(id).get();
	}
	
	public List<Produto> readAll(){
		return repository.findAll();
	}
	
	public Produto update(Produto produto) {
		if (repository.existsById(produto.getId())) 
		{	return repository.save(produto);
		}
		return null;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
