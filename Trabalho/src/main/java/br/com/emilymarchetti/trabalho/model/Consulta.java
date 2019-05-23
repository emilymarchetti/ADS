package br.com.emilymarchetti.trabalho.model;

import java.time.LocalDateTime;

public class Consulta extends DadosConsulta{

    private String sintomas;
    private String prescricaoMedica;



    protected void agendarRetorno(LocalDateTime dataHora){
        Consulta consulta = new Consulta();
        consulta.setDataHora(dataHora);
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
