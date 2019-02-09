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


import br.com.teste.models.ItemVenda;
import br.com.teste.services.ItemVendaService;

@Controller
@RequestMapping("/item_venda")
public class ItemVendaController {

	@Autowired
	ItemVendaService service;
	
	@PostMapping
	public ResponseEntity<ItemVenda> create (@RequestBody ItemVenda itemVenda)
	{	return new ResponseEntity<ItemVenda>(service.create(itemVenda),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ItemVenda> readId(@PathVariable Long id)
	{	return new ResponseEntity<ItemVenda>(service.readId(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<ItemVenda>> readAll()
	{	return new ResponseEntity<List<ItemVenda>>(service.readAll(),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<ItemVenda> update(@RequestBody ItemVenda itemVenda)
	{	return new ResponseEntity<ItemVenda>(service.update(itemVenda),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ItemVenda> delete(@PathVariable Long id)
	{	service.delete(id);
		return new ResponseEntity<ItemVenda>(HttpStatus.OK);
	}
}
