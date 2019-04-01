package Imobiliaria;

public class Imovel {

    private Endereco endereco;
    private int banheiro;
    private int quarto;
    private int suite;
    private Double preco;
    private Double tamanho;
    private String tipo;

    public Imovel(Endereco endereco, int banheiro, int quarto, int suite, Double preco, Double tamanho, String tipo) {
        this.endereco = endereco;
        this.banheiro = banheiro;
        this.quarto = quarto;
        this.suite = suite;
        this.preco = preco;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public int getBanheiro() {
        return banheiro;
    }

    public int getQuarto() {
        return quarto;
    }

    public int getSuite() {
        return suite;
    }

    public Double getPreco() {
        return preco;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public String getTipo() {
        return tipo;
    }
}
