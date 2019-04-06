package br.com.emilymarchetti.imobiliaria;

public class Vendedor extends Pessoa {

    private double salarioBruto;
    private double salarioLiquido;

    public Vendedor(String nome, String telefone, Endereco endereco,double salarioBruto) {
        super(nome, telefone, endereco);
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }


    public double calculaSalarioLiquido(double comissao){
        return this.salarioLiquido = this.salarioLiquido + this.salarioBruto + comissao;
    }
}
