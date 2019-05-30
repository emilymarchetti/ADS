package br.com.emilymarchetti.imobiliaria;

import java.util.ArrayList;

public class Imovel {

    private Endereco endereco;
    private int banheiro;
    private int quarto;
    private int suite;
    private Double preco;
    private Double tamanho;
    private TipoImovel tipo;
    private StatusImovel status;

    public Imovel(Endereco endereco, int banheiro, int quarto, int suite, Double preco, Double tamanho, TipoImovel tipo, StatusImovel status) {
        this.endereco = endereco;
        this.banheiro = banheiro;
        this.quarto = quarto;
        this.suite = suite;
        this.preco = preco;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.status = status;
    }

    public ArrayList<Imovel> ListaImoveis = new ArrayList<Imovel>();

    public void novoImovel (Imovel imovel){
        ListaImoveis.add(imovel);
    }

    @Override
    public String toString() {
      for (int i = 0; i < ListaImoveis.size();i++){
          System.out.println("Endereço: "+ ListaImoveis.get(i).getEndereco().toString() + " | Banheiros: "
                  + ListaImoveis.get(i).getBanheiro() + " | Quartos: " + ListaImoveis.get(i).getQuarto()
                  + " | Suítes: " + ListaImoveis.get(i).getSuite() + " | Tamanho: " + ListaImoveis.get(i).getTamanho()
                  + " | Preço: R$" + ListaImoveis.get(i).getPreco() + " | Tipo: " + ListaImoveis.get(i).getTipo()
                  + " | Status: " + ListaImoveis.get(i).getStatus());
      }
      return null;
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

    public TipoImovel getTipo() {
        return tipo;
    }

    public StatusImovel getStatus() { return status; }

    protected void setStatus(StatusImovel status) {
        this.status = status;
    }
}
