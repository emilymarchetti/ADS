package exTres;

public class Advogado extends Usuario {

    private String oab;

    public Advogado(String nome, PessoaFisica pessoa, String oab) {
        super(nome, pessoa);
        this.oab = oab;
    }
}
