
package com.ufc.nerds.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufc.nerds.modelo.Patrimonio;
import com.ufc.nerds.service.PatrimonioService;
//Camada mais superior em contato direto com htpp, alguem pede algo pela api requesições get post etc, eu me aprofundo nas camadas e retorno algo depois de algo ser feito.
// Controller -> Service -> Repositorio -> Patrimonio.
@RestController
@RequestMapping("/patrimonios")

public class PatrimonioController {

    @SuppressWarnings("FieldMayBeFinal")
    private PatrimonioService service;

    public PatrimonioController(PatrimonioService service){
        this.service = service;
}

@GetMapping
    public List<Patrimonio> listar(){
        return service.listar();
}

@PostMapping
    public void cadastrar(@RequestBody Patrimonio patrimonio){
        service.cadastrar(patrimonio);
    }   
}






