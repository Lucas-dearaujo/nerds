package com.ufc.nerds.repositorio;
import java.util.ArrayList;
import java.util.List;

import com.ufc.nerds.modelo.Patrimonio;

public class PatrimonioRepositorio {
    private List<Patrimonio> listaPatrimonio;

    public PatrimonioRepositorio(){
    listaPatrimonio = new ArrayList<>();
    }

    public List<Patrimonio> getListaPatrimonio(){
        return this.listaPatrimonio;
    }

    public void cadastrar(Patrimonio equipamento){
        listaPatrimonio.add(equipamento);
    }

    public void remover(Patrimonio equipamento){
        listaPatrimonio.remove(equipamento);
    }
    public Patrimonio buscar(String num_serie){
        for(Patrimonio p :listaPatrimonio){
            if (p.getNumeroSerie().equals(num_serie)) {
                return p;
            }
        }
        return null;
    }
    
   public List<Patrimonio> listar(){
    return this.listaPatrimonio;
}
    
}
