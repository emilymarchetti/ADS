package advocacia;

public class Secretaria extends PessoaFisica {

    private String numCarteira;

    public Secretaria(String nome, String cpf, String numCarteira) {
        super(nome, cpf);
        this.numCarteira = numCarteira;
    }
}
