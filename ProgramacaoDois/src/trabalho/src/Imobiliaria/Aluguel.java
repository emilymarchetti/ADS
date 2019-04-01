package Imobiliaria;

import java.math.BigDecimal;

public class Aluguel{
    private int duracaoContrato;
    private Pessoa pessoa;
    private Imovel imovel;

    public Aluguel(Imovel imovel, int duracaoContrato,Pessoa pessoa) {
        this.pessoa = pessoa;
        this.duracaoContrato = duracaoContrato;
        this.imovel = imovel;
    }

    public void alugar(){
        imovel.setStatus(StatusImovel.ALUGADO);
    }

    public int getDuracaoContrato() {
        return duracaoContrato;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Imovel getImovel() {
        return imovel;
    }

}
