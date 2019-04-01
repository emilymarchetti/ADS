package exerciciosTest.exUm;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {

    @Test
    public void mudarNomePessoa(){
        Pessoa pessoa = new Pessoa("Emily","12344097988","22/10/2000");
        pessoa.setNome("João");
        Assert.assertEquals("João", pessoa.getNome());
    }

}
