package com.arn.mc2;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arn.mc2.domain.Categoria;
import com.arn.mc2.repositories.CategoriaRepository;


@SpringBootApplication
public class Cursomc2Application implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(Cursomc2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritorio");
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
	}
	

}

