
package com.ufc.nerds.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufc.nerds.modelo.Patrimonio;
import com.ufc.nerds.service.PatrimonioService;

@RestController //essa classe responde requisições HTTP, retorna JSON automaticamente //define a URL base
@RequestMapping("/patrimonios")
public class PatrimonioController {

    private PatrimonioService service;

    public PatrimonioController(PatrimonioService service){
        this.service = service;
}
@PostMapping //POST, mapeia
    public void cadastrar(@RequestBody Patrimonio patrimonio){
        service.cadastrar(patrimonio);
    }


@GetMapping
    public List<Patrimonio> listar(){
        return service.listar();
    }

@DeleteMapping("/{numeroSerie}")
    public void remover(@PathVariable String numeroSerie) {
        service.remover(numeroSerie);
}

@PutMapping("/{numeroSerie}")
    public void atualizar(@PathVariable String numeroSerie, @RequestBody Patrimonio patrimonio) {
    service.atualizar(numeroSerie, patrimonio);
}
}









