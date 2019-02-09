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

import br.com.teste.models.Conta;
import br.com.teste.services.ContaService;

@Controller
@RequestMapping("/conta")
public class ContaController {
	
	@Autowired
	ContaService service;
	
	@PostMapping
	public ResponseEntity<Conta> create (@RequestBody Conta conta)
	{	return new ResponseEntity<Conta>(service.create(conta),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Conta> readId(@PathVariable Long id)
	{	return new ResponseEntity<Conta>(service.readId(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Conta>> readAll()
	{	return new ResponseEntity<List<Conta>>(service.readAll(),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Conta> update(@RequestBody Conta conta)
	{	return new ResponseEntity<Conta>(service.update(conta),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Conta> delete(@PathVariable Long id)
	{	service.delete(id);
		return new ResponseEntity<Conta>(HttpStatus.OK);
	}

}
