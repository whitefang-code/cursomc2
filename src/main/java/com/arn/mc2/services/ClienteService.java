package com.arn.mc2.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arn.mc2.domain.Cliente;
import com.arn.mc2.repositories.ClienteRepository;
import com.arn.mc2.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired	
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		
		
		Optional <Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + id +",Tipo" + Cliente.class.getName()));
		
	}
	
}
