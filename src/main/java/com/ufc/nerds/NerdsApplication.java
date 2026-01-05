package com.ufc.nerds;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ufc.nerds.modelo.Patrimonio;
import com.ufc.nerds.repositorio.PatrimonioRepositorio;

@SpringBootApplication
public class NerdsApplication {

	public static void main(String[] args) {
		Patrimonio cadeira = new Patrimonio("cadeira" , "mobilia", "330454", 1);
		PatrimonioRepositorio estoque = new PatrimonioRepositorio();
		estoque.cadastrar(cadeira);
		//System.out.println(cadeira);
		//SpringApplication.run(NerdsApplication.class, args);
	}

}
