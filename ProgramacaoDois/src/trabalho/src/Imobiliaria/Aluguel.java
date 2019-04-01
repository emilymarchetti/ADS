package Imobiliaria;

public class Aluguel{
    private int duracaoContrato;
    private Pessoa pessoa;
    private Imovel imovel;

    public Aluguel(Imovel imovel, int duracaoContrato,Pessoa pessoa) {
        this.pessoa = pessoa;
        this.duracaoContrato = duracaoContrato;
        this.imovel = imovel;
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
