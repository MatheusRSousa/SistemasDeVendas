package br.com.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.models.Usuario;
import br.com.teste.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repository;
	
	public Usuario create(Usuario usuario) {
		return repository.save(usuario);
	}
	
	public Usuario readId(Long id) {
		return repository.findById(id).get();
	}
	
	public List<Usuario> readAll(){
		return repository.findAll();
	}
	
	public Usuario update(Usuario usuario) {
		if (repository.existsById(usuario.getId())) 
		{	return repository.save(usuario);
		}
		return null;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
