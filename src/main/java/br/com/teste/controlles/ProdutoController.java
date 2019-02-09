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

import br.com.teste.models.Produto;
import br.com.teste.services.ProdutoService;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	ProdutoService service;
	
	@PostMapping
	public ResponseEntity<Produto> create (@RequestBody Produto produto)
	{	return new ResponseEntity<Produto>(service.create(produto),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> readId(@PathVariable Long id)
	{	return new ResponseEntity<Produto>(service.readId(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Produto>> readAll()
	{	return new ResponseEntity<List<Produto>>(service.readAll(),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Produto> update(@RequestBody Produto produto)
	{	return new ResponseEntity<Produto>(service.update(produto),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Produto> delete(@PathVariable Long id)
	{	service.delete(id);
		return new ResponseEntity<Produto>(HttpStatus.OK);
	}
}
