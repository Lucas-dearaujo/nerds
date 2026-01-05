package com.ufc.nerds.modelo;
public class Patrimonio {
    
    private int id;
    private String nome;
    private String tipo;
    private String numeroSerie;

    public Patrimonio(){}

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Patrimonio(String nome, String tipo, String numeroSerie, int id){
        setId(id);
        setNome(nome);
        setTipo(tipo);
        setNumeroSerie(numeroSerie);
    }
    
    @Override
    public String toString() {
        return this.nome + "\n" + this.tipo + "\n" + this.numeroSerie + "\n" + this.id;
    }


    public int getid(){
        return id;
    }

    void setId(int id){
        if(id >= 0){
            this.id=id;
        }
    }

    public String getnome(){
        return this.nome;
    }

    void setNome(String nome){
        if(nome != null){
        this.nome= nome;
        }
    }
   public String getTipo(){
        return this.tipo;
    }

    void setTipo(String tipo){
        if(tipo != null){
        this.tipo= tipo;
        }
    }

    public String getNumeroSerie(){
        return this.numeroSerie;
    }

    void setNumeroSerie(String numeroSerie){
        if(numeroSerie != null){
        this.numeroSerie= numeroSerie;
        }
    } 
}
