package com.ufc.nerds.exception;

public class PatrimonioNaoEncontradoException extends RuntimeException{
    public PatrimonioNaoEncontradoException( String numero_serie){
        super("Patrimonio não encontrado:" + numero_serie);
    }
}
