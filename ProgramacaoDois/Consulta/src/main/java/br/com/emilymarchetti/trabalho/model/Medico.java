package br.com.emilymarchetti.trabalho.model;

import static br.com.emilymarchetti.trabalho.exceptions.ValidacaoUtil.validarCampoObrigatorio;

public class Medico extends Pessoa {

    private String crm;

    @Override
    protected void validar() {
        validarCampoObrigatorio(getCrm(),"O CRM é obrigatório");
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + getId() +
                "nome='" + getNome() + '\'' + ",crm:" +
                getCrm() + ", telefone='" + getTelefone() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                '}';
    }
}
