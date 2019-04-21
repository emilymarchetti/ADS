package br.com.emilymarchetti.front.produtoFormulario;

public class CampoVazioException extends RuntimeException{

    public CampoVazioException() {
        super("Favor preencha todos os campos!");
    }
}
