package com.treinamento.cursomc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.treinamento.cursomc.domain.Categoria;
import com.treinamento.cursomc.resources.CategoriaResource;

@SpringBootApplication
public class CursomcApplication{
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		
//		Categoria cat1 = new Categoria(null, "Informática");
//		Categoria cat2 = new Categoria(null, "Escritório");
//	}

}
	