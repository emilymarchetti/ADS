package br.com.emilymarchetti.trabalho.model;

public abstract class Pessoa extends Entidade {

    private String nome;
    private String telefone;
    private String cpf;

    public Pessoa(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public Pessoa() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "Pessoa{" + "id=" + getId() +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
