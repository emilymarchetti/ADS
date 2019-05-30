package br.com.emilymarchetti.front.produtoFormulario;

public class Produto {

    private String codigo;
    private String nome;

    @Override
    public String toString(){
            return ("Código: " + codigo + "\n Nome: " + nome );
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
