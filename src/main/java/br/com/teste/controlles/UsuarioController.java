package br.com.teste.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.teste.models.Usuario;
import br.com.teste.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService service;
	
	@PostMapping
	public ResponseEntity<Usuario> create (@RequestBody Usuario usuario)
	{	return new ResponseEntity<Usuario>(service.create(usuario),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> readId(@PathVariable Long id)
	{	return new ResponseEntity<Usuario>(service.readId(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>> readAll()
	{	return new ResponseEntity<List<Usuario>>(service.readAll(),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Usuario> update(@RequestBody Usuario usuario)
	{	return new ResponseEntity<Usuario>(service.update(usuario),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Usuario> delete(@PathVariable Long id)
	{	service.delete(id);
		return new ResponseEntity<Usuario>(HttpStatus.OK);
	}
}
