package imobiliaria;

public class Venda implements Comissao{


    private double comissao;
    private Vendedor vendedor;
    private Pessoa pessoa;
    private Imovel imovel;

    public Venda(Vendedor vendedor, Pessoa pessoa, Imovel imovel) {
        this.vendedor = vendedor;
        this.pessoa = pessoa;
        this.imovel = imovel;
    }

    @Override
    public void calculoComissao() {
        this.comissao =+ imovel.getPreco()*0.10;
    }

    public double getComissao() {
        return this.comissao;
    }
}
