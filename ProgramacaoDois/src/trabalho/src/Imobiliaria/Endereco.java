package Imobiliaria;

public class Endereco {

    private String logradouro;
    private int numero;
    private String bairro;
    private Cidade cidade;
    private Estado estado;

    public Endereco(String rua, int numero, String bairro, Cidade cidade, Estado estado) {
        this.logradouro = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    @Override
    public String toString(){
        return getLogradouro() + ", " + getNumero() + " - " + getBairro() + ", " + getCidade() + "/" + getEstado();
    }
}
