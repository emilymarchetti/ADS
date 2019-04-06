package br.com.emilymarchetti.imobiliaria;

public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public PessoaJuridica(String nome, String telefone, Endereco endereco, String cnpj) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
