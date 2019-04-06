package br.com.emilymarchetti.imobiliaria;

public class PessoaFisica extends Pessoa{

    private String cpf;
    private String sobrenome;

    public PessoaFisica(String nome, String telefone, Endereco endereco, String cpf, String sobrenome) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}
