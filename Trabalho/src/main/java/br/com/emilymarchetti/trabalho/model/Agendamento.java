package br.com.emilymarchetti.trabalho.model;

import java.time.LocalDateTime;

public class Agendamento extends DadosConsulta {

    public String observacao;

    public void reagendar(Agendamento agendamento, LocalDateTime dataHora){
        agendamento.setDataHora(dataHora);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
