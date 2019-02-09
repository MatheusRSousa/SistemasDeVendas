package br.com.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.teste.models.TipoUsuario;
import br.com.teste.repositories.TipoUsuarioRepository;

@Service
public class TipoUsuarioService {

	@Autowired
	TipoUsuarioRepository repository;
	
	public TipoUsuario create(TipoUsuario tipoUsuario) {
		return repository.save(tipoUsuario);
	}
	
	public TipoUsuario readId(Long id) {
		return repository.findById(id).get();
	}
	
	public List<TipoUsuario> readAll(){
		return repository.findAll();
	}
	
	public TipoUsuario update(TipoUsuario tipoUsuario) {
		if (repository.existsById(tipoUsuario.getId())) 
		{	return repository.save(tipoUsuario);
		}
		return null;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
