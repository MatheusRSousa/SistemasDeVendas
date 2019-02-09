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

import br.com.teste.models.EstoqueEntrada;
import br.com.teste.services.EstoqueEntradaService;

@Controller
@RequestMapping("/estoque_entrada")
public class EstoqueEntradaController {

	@Autowired
	EstoqueEntradaService service;
	
	@PostMapping
	public ResponseEntity<EstoqueEntrada> create (@RequestBody EstoqueEntrada estoqueEntrada)
	{	return new ResponseEntity<EstoqueEntrada>(service.create(estoqueEntrada),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EstoqueEntrada> readId(@PathVariable Long id)
	{	return new ResponseEntity<EstoqueEntrada>(service.readId(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<EstoqueEntrada>> readAll()
	{	return new ResponseEntity<List<EstoqueEntrada>>(service.readAll(),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<EstoqueEntrada> update(@RequestBody EstoqueEntrada estoqueEntrada)
	{	return new ResponseEntity<EstoqueEntrada>(service.update(estoqueEntrada),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<EstoqueEntrada> delete(@PathVariable Long id)
	{	service.delete(id);
		return new ResponseEntity<EstoqueEntrada>(HttpStatus.OK);
	}
}
