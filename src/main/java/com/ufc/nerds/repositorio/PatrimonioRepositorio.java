package com.ufc.nerds.repositorio;
import java.util.ArrayList;
import java.util.List;

import com.ufc.nerds.modelo.Patrimonio;

public class PatrimonioRepositorio {
    private List<Patrimonio> listaPatrimonio;

    public PatrimonioRepositorio(){
    listaPatrimonio = new ArrayList<>();
    }

    public void CadastrarEquipamento(Patrimonio Equipamento){
        listaPatrimonio.add(Equipamento);
    }
    
}
