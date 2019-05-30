package br.com.emilymarchetti.trabalho.exceptions;

public class RegistroNaoExistenteException extends RuntimeException {

    public RegistroNaoExistenteException(String message) {
        super(message);
    }
}
