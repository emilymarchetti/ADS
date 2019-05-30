package br.com.emilymarchetti.trabalho.exceptions;

public class CampoObrigatorioException extends RuntimeException{

    public CampoObrigatorioException(String message) {
        super(message);
    }
}
