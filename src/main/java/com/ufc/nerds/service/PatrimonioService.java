package com.ufc.nerds.service;
import com.ufc.nerds.modelo.Patrimonio;
import com.ufc.nerds.repositorio.PatrimonioRepositorio;

public class PatrimonioService {
     
    @SuppressWarnings("FieldMayBeFinal")
    private PatrimonioRepositorio repositorio;

    public PatrimonioService(PatrimonioRepositorio repositorio){
        this.repositorio=repositorio;
    }

    public void cadastrar(Patrimonio patrimonio){
        if( repositorio.buscar(patrimonio.getNumeroSerie())!= null ){
            System.out.println("Número de série já existe, Futura implementação, Exeption para cadsatro");
        }
        else{
            repositorio.cadastrar(patrimonio);
        }

    }
}
