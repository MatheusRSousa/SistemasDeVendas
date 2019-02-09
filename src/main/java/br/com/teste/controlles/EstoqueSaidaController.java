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

import br.com.teste.models.EstoqueSaida;
import br.com.teste.services.EstoqueSaidaService;

@Controller
@RequestMapping("/estoque_saida")
public class EstoqueSaidaController {

	@Autowired
	EstoqueSaidaService service;
	
	@PostMapping
	public ResponseEntity<EstoqueSaida> create (@RequestBody EstoqueSaida estoqueSaida)
	{	return new ResponseEntity<EstoqueSaida>(service.create(estoqueSaida),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EstoqueSaida> readId(@PathVariable Long id)
	{	return new ResponseEntity<EstoqueSaida>(service.readId(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<EstoqueSaida>> readAll()
	{	return new ResponseEntity<List<EstoqueSaida>>(service.readAll(),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<EstoqueSaida> update(@RequestBody EstoqueSaida estoqueSaida)
	{	return new ResponseEntity<EstoqueSaida>(service.update(estoqueSaida),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<EstoqueSaida> delete(@PathVariable Long id)
	{	service.delete(id);
		return new ResponseEntity<EstoqueSaida>(HttpStatus.OK);
	}
}
