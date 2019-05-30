package br.com.emilymarchetti.trabalho.model;

import java.time.LocalDateTime;

public class Agendamento extends DadosConsulta {

    private String observacao;

    public Agendamento(Paciente paciente, Medico medico, LocalDateTime dataHora) {
        super(paciente, medico, dataHora);
    }

    public Agendamento(Paciente paciente, Medico medico, LocalDateTime dataHora, String observacao) {
        super(paciente, medico, dataHora);
        this.observacao = observacao;
    }

    public void reagendar(Agendamento agendamento, LocalDateTime dataHora){
        agendamento.setDataHora(dataHora);
    }

    public String getObservacao() {
        return observacao;
    }
}
