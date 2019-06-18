package br.com.emilymarchetti.trabalho.model;

import java.time.LocalDateTime;

public abstract class DadosConsulta extends Entidade {

    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataHora;

    public DadosConsulta(Paciente paciente, Medico medico, LocalDateTime dataHora) {
       this.paciente = paciente;
       this.medico = medico;
       this.dataHora = dataHora;
    }

    public DadosConsulta() {
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "DadosConsulta{" +
                "id=" + getId() +
                "paciente=" + paciente +
                ", medico=" + medico +
                ", dataHora=" + dataHora +
                '}';
    }
}
