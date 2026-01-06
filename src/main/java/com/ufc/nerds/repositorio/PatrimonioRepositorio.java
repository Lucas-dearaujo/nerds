package com.ufc.nerds.repositorio;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ufc.nerds.modelo.Patrimonio;
//Camada de dados, como é feito a manipulação dos dados.
@Repository
public class PatrimonioRepositorio {
    
    private List<Patrimonio> listaPatrimonio;

    public PatrimonioRepositorio(){
        listaPatrimonio = new ArrayList<>();
    }

    public void cadastrar(Patrimonio equipamento){
        listaPatrimonio.add(equipamento);
       
    }

    public boolean remover(String num_serie){
        Patrimonio temp = buscar(num_serie);
            if(temp != null){
                listaPatrimonio.remove(temp);
                return true;
        }
        return false;
    }
    public Patrimonio buscar(String num_serie){
        for(Patrimonio p :listaPatrimonio){
            if (p.getNumeroSerie().equals(num_serie)) {
                return p;
            }
        }
        return null;
    }
    
    public boolean atualizar(String num_Serie, Patrimonio novosDados){
     Patrimonio temp = buscar(num_Serie);
     if(temp != null){
        temp.setNome(novosDados.getNome());
        temp.setTipo(novosDados.getTipo());
        temp.setEstado(novosDados.getEstado());
        temp.setAlocado(novosDados.getAlocado());
        return true;
     }
     return false;
        
    }
    
   public List<Patrimonio> listar(){
    return listaPatrimonio;
}
    
}
