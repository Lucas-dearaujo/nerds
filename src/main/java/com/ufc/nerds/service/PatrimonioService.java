package com.ufc.nerds.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ufc.nerds.exception.NumeroSerieException;
import com.ufc.nerds.exception.PatrimonioNaoEncontradoException;
import com.ufc.nerds.modelo.Patrimonio;
import com.ufc.nerds.repositorio.PatrimonioRepositorio;
//Sou a camada do service, aqui eu me preocupo com as regras de negocio e outras validações oque pode ou nao fazer? eu nao me preocupo com htpp.
@Service
public class PatrimonioService {
     
    private PatrimonioRepositorio repositorio;

    public PatrimonioService(PatrimonioRepositorio repositorio){
        this.repositorio=repositorio;
    }

    public void cadastrar(Patrimonio patrimonio){
        if( repositorio.buscar(patrimonio.getNumeroSerie()) != null ){
            throw new NumeroSerieException(patrimonio.getNumeroSerie());
        }
        else{
            repositorio.cadastrar(patrimonio);
        }
    }
    public void remover(String num_serie){
      boolean removido = repositorio.remover(num_serie);
        if(!removido){
            throw new PatrimonioNaoEncontradoException(num_serie);
        }
    }
    public void atualizar(String numeroSerie, Patrimonio patrimonio){
        boolean atualizado = repositorio.atualizar(numeroSerie, patrimonio);
        if(!atualizado){
            throw new PatrimonioNaoEncontradoException(numeroSerie);
        }
    }
    public List <Patrimonio> listar(){
        return repositorio.listar();
    }
}
