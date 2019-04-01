package advocacia;

public class Usuario extends Pessoa{

    PessoaFisica pessoa;
    //private String login;
    //private String senha;


    public Usuario(String nome, PessoaFisica pessoa) {
        super(nome);
        this.pessoa = pessoa;

    }

        //this.login = login;
        //this.senha = senha;
}
