package br.com.emilymarchetti.revisao;

public class LocacaoFechadaException extends RuntimeException {

    public LocacaoFechadaException() {
        super("A locacão já está fechada");
    }
}
