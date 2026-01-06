package com.ufc.nerds;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ufc.nerds.controller.PatrimonioController;
import com.ufc.nerds.repositorio.PatrimonioRepositorio;
import com.ufc.nerds.service.PatrimonioService;

@SpringBootApplication
public class NerdsApplication {

	public static void main(String[] args) {
		PatrimonioRepositorio estoque = new PatrimonioRepositorio();
		PatrimonioService servicos = new PatrimonioService(estoque);
		PatrimonioController head  = new PatrimonioController(servicos);
		/* 
		Patrimonio cadeira = new Patrimonio("cadeira" , "mobilia", "330454", true, true);
		Patrimonio mesa = new Patrimonio("Mesa L", "Mobilia" , "226471" ,true, true );
		Patrimonio notebook = new Patrimonio("asus" , "tecnologia", "61234" , true, true);
		*/
		//System.out.println(cadeira);
		//SpringApplication.run(NerdsApplication.class, args);
	}

}
