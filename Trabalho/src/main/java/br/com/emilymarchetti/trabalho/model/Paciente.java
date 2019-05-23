package br.com.emilymarchetti.trabalho.model;

import java.time.LocalDate;

public class Paciente extends Pessoa {

    private LocalDate dataNascimento;

    @Override
    protected void validar() {
        //implementar
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
