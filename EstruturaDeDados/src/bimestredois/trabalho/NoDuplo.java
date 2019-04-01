package bimestredois.trabalho;

public class NoDuplo {
    private Integer elemento;
    private NoDuplo proximo;
    private NoDuplo anterior;

    public Integer getElemento() {
        return elemento;
    }
    public void setElemento(Integer elemento) {
        this.elemento = elemento;
    }
    public NoDuplo getProximo() {
        return proximo;
    }
    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }
    public NoDuplo getAnterior() {
        return anterior;
    }
    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }
}

