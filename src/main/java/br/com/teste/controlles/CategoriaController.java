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

import br.com.teste.models.Categoria;
import br.com.teste.services.CategoriaService;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	CategoriaService service;
	
	@PostMapping
	public ResponseEntity<Categoria> create (@RequestBody Categoria categoria)
	{	return new ResponseEntity<Categoria>(service.create(categoria),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> readId(@PathVariable Long id)
	{	return new ResponseEntity<Categoria>(service.readId(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Categoria>> readAll()
	{	return new ResponseEntity<List<Categoria>>(service.readAll(),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Categoria> update(@RequestBody Categoria categoria)
	{	return new ResponseEntity<Categoria>(service.update(categoria),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Categoria> delete(@PathVariable Long id)
	{	service.delete(id);
		return new ResponseEntity<Categoria>(HttpStatus.OK);
	}
}
