package com.ufc.nerds.exception;

public class NumeroSerieException extends RuntimeException {
    public NumeroSerieException(String numeroSerie){
        super("Erro, numero de serie, ja consta cadastro no sistema:" + numeroSerie);
    }
}
