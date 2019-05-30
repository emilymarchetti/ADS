package br.com.emilymarchetti.trabalho.model;

import java.time.LocalDateTime;

public class Consulta extends DadosConsulta{

    private String sintomas;
    private String prescricaoMedica;

    public Consulta(Paciente paciente, Medico medico, String sintomas) {
        super(paciente, medico, LocalDateTime.now());
        this.sintomas = sintomas;
    }

    public Consulta(Agendamento agendamento, String sintomas) {
        super(agendamento.getPaciente(), agendamento.getMedico(), LocalDateTime.now());
        this.sintomas = sintomas;
    }


    protected void agendarRetorno(LocalDateTime dataHora, Consulta consulta){
        Agendamento agendamento = new Agendamento(consulta.getPaciente(),consulta.getMedico(),dataHora);
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getPrescricaoMedica() {
        return prescricaoMedica;
    }

    public void setPrescricaoMedica(String prescricaoMedica) {
        this.prescricaoMedica = prescricaoMedica;
    }

    @Override
    public String toString() {
        return "Sintomas: " + sintomas + "\nPrescricao Médica: " + prescricaoMedica;
    }
}
