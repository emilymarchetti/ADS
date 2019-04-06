package br.com.emilymarchetti.revisao;

public class Cliente extends Funcionario {

    private String email;
    private String telefone;

    public Cliente(String nome, String cpf, String email, String telefone) {
        super(nome, cpf);
        this.email = email;
        this.telefone = telefone;
    }
}
