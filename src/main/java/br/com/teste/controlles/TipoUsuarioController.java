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


import br.com.teste.models.TipoUsuario;
import br.com.teste.services.TipoUsuarioService;

@Controller
@RequestMapping("/tipo_usuario")
public class TipoUsuarioController {

	@Autowired
	TipoUsuarioService service;
	
	@PostMapping
	public ResponseEntity<TipoUsuario> create (@RequestBody TipoUsuario tipoUsuario)
	{	return new ResponseEntity<TipoUsuario>(service.create(tipoUsuario),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TipoUsuario> readId(@PathVariable Long id)
	{	return new ResponseEntity<TipoUsuario>(service.readId(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<TipoUsuario>> readAll()
	{	return new ResponseEntity<List<TipoUsuario>>(service.readAll(),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<TipoUsuario> update(@RequestBody TipoUsuario tipoUsuario)
	{	return new ResponseEntity<TipoUsuario>(service.update(tipoUsuario),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<TipoUsuario> delete(@PathVariable Long id)
	{	service.delete(id);
		return new ResponseEntity<TipoUsuario>(HttpStatus.OK);
	}
}
