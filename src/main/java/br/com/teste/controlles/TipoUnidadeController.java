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

import br.com.teste.models.TipoUnidade;
import br.com.teste.services.TipoUnidadeService;

@Controller
@RequestMapping("/tipo_unidade")
public class TipoUnidadeController {

	@Autowired
	TipoUnidadeService service;
	
	@PostMapping
	public ResponseEntity<TipoUnidade> create (@RequestBody TipoUnidade tipoUnidade)
	{	return new ResponseEntity<TipoUnidade>(service.create(tipoUnidade),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TipoUnidade> readId(@PathVariable Long id)
	{	return new ResponseEntity<TipoUnidade>(service.readId(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<TipoUnidade>> readAll()
	{	return new ResponseEntity<List<TipoUnidade>>(service.readAll(),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<TipoUnidade> update(@RequestBody TipoUnidade tipoUnidade)
	{	return new ResponseEntity<TipoUnidade>(service.update(tipoUnidade),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<TipoUnidade> delete(@PathVariable Long id)
	{	service.delete(id);
		return new ResponseEntity<TipoUnidade>(HttpStatus.OK);
	}
}
