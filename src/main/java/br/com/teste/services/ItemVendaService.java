package br.com.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.models.ItemVenda;
import br.com.teste.repositories.ItemVendaRepository;

@Service
public class ItemVendaService {

	@Autowired
	ItemVendaRepository repository;
	
	public ItemVenda create(ItemVenda itemVenda) {
		return repository.save(itemVenda);
	}
	
	public ItemVenda readId(Long id) {
		return repository.findById(id).get();
	}
	
	public List<ItemVenda> readAll(){
		return repository.findAll();
	}
	
	public ItemVenda update(ItemVenda itemVenda) {
		if (repository.existsById(itemVenda.getId())) 
		{	return repository.save(itemVenda);
		}
		return null;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
