package br.com.emilymarchetti.revisao;

public class VeiculoIndisponivelException extends RuntimeException {

    public VeiculoIndisponivelException() {
        super("O veículo está indisponível");
    }
}
