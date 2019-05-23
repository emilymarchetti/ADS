package br.com.emilymarchetti.trabalho.model;

public class Medico extends Pessoa {

    private String crm;

    @Override
    protected void validar() {
        //implementar
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }


}
