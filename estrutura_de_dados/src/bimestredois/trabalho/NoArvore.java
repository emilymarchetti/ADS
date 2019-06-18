package bimestredois.trabalho;

import java.util.List;

public class NoArvore {
    private String elemento;
    private NoArvore pai;
    private List<NoArvore> filhos;

    public String getElemento() {
        return elemento;
    }
    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
    public NoArvore getPai() {
        return pai;
    }
    public void setPai(NoArvore pai) {
        this.pai = pai;
    }
    public List<NoArvore> getFilhos() {
        return filhos;
    }
    public void setFilhos(List<NoArvore> filhos) {
        this.filhos = filhos;
    }
}

