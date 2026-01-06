package com.ufc.nerds.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//Sou uma classe responsavel por todas as exceptions , que trata elas em um lugar so de todos os controllers
@RestControllerAdvice
public class GlobalExceptionHandler {
    //Quando x exception acontecer, chame este metodo.
    @ExceptionHandler(NumeroSerieException.class)
    
    public ResponseEntity <String> TratamentoNumSerieDuplicado(NumeroSerieException exemplo){
        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(exemplo.getMessage());
    }
    
    @ExceptionHandler(PatrimonioNaoEncontradoException.class)
    public ResponseEntity <String> TratamentoPatrimonioNaoEncontrado ( PatrimonioNaoEncontradoException exemplo2){
        return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .body(exemplo2.getMessage());
    }
}
