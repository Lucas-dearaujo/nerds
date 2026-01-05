package com.ufc.nerds.modelo;
public class Patrimonio {
    
    private String nome;
    private String tipo;
    private String numeroSerie;
    //Estado se refere a condição do patrimonio, se ele esta em boa condição de uso, ou é necessario manutenção/troca.
    private boolean estado;
    //Alocação indica se o patrimonio ja foi alocado para alguma sala por exemplo.
    private boolean alocado;

    public Patrimonio(){}

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Patrimonio(String nome, String tipo, String numeroSerie, boolean  estado, boolean alocado){
        setNome(nome);
        setTipo(tipo);
        setNumeroSerie(numeroSerie);
        setEstado(estado);

    }
    
    @Override
    public String toString(){
        return this.nome + "\n" + this.tipo + "\n" + this.numeroSerie + "\n" + this.estado;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        if(nome != null){
        this.nome= nome;
        }
    }
   public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        if(tipo != null){
        this.tipo= tipo;
        }
    }

    public String getNumeroSerie(){
        return this.numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie){
        if(numeroSerie != null){
        this.numeroSerie= numeroSerie;
        }
    } 
    public boolean getEstado(){
        return this.estado;
    }
    public void setEstado(boolean estado){
        this.estado = false;
    }
     public boolean getAlocado(){
        return this.alocado;
    }
    public void setAlocado(boolean alocado){
        this.alocado = alocado;
    } 
}
