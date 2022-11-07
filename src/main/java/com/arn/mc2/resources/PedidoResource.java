package com.arn.mc2.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arn.mc2.domain.Pedido;
import com.arn.mc2.services.PedidoService;

@RestController
@RequestMapping("/pedidos")

public class PedidoResource {
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Optional<Pedido> obj = Optional.ofNullable(service.buscar(id));
		return ResponseEntity.ok().body(obj);
			
	}

	

}
