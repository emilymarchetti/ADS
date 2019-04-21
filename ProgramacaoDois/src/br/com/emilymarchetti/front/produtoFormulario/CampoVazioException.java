package br.com.emilymarchetti.front.produtoFormulario;

public class CampoVazioException extends RuntimeException{

    private final static String MENSAGE = "Favor preencha todos os campos!";

    public CampoVazioException() {
        super(MENSAGE);
    }

    public static String getMENSAGE() {
        return MENSAGE;
    }
}
