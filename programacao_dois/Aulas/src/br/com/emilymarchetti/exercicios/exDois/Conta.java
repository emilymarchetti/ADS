package br.com.emilymarchetti.exercicios.exDois;

import br.com.emilymarchetti.exercicios.exUm.Pessoa;

public class Conta {

    private Pessoa pessoa;
    private String numConta;
    private TipoConta tipoConta;
    private long saldo;

    public Conta(Pessoa pessoa, String numConta, TipoConta tipoConta) {
        this.pessoa = pessoa;
        this.numConta = numConta;
        this.tipoConta = tipoConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public String getNumConta() {
        return numConta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public long getSaldo() {
        return saldo;
    }

    public void deposito(long valor){
        saldo =+ valor;
    }

    public void saque(long valor){
        if (valor > this.saldo){
            throw new RuntimeException("Erro");
        }else{
            this.saldo -= valor;
        }
    }

}
