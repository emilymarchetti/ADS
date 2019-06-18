package br.com.emilymarchetti.trabalho.model;

import java.time.LocalDate;
import static br.com.emilymarchetti.trabalho.exceptions.ValidacaoUtil.validarCampoObrigatorio;

public class Paciente extends Pessoa {

    private LocalDate dataNascimento;

    public Paciente(String nome, String telefone, String cpf, LocalDate dataNascimento) {
        super(nome, telefone, cpf);
        this.dataNascimento = dataNascimento;
    }

    public Paciente() {}

    @Override
    protected void validar() {
        validarCampoObrigatorio(getCpf(), "O cpf é obrigatório");
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + getId() +
                "nome='" + getNome() + '\'' + ",dataNascimento:" +
                getDataNascimento() + ", telefone='" + getTelefone() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                '}';
    }
}
