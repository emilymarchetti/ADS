package exerciciosTest.exDois;

import exerciciosTest.exUm.Pessoa;
import org.junit.Assert;
import org.junit.Test;

public class TesteConta {

    @Test

    public void testeDeposito (){
        Pessoa pessoa = new Pessoa("Emily","12344097988","22/10/2000");
        Conta conta = new Conta(pessoa,"125497",TipoConta.CORRENTE);
        conta.deposito(20);
        Assert.assertEquals(20,conta.getSaldo());
    }

    @Test
    public void testeSaque(){
        Pessoa pessoa = new Pessoa("Emily","12344097988","22/10/2000");
        Conta conta = new Conta(pessoa,"125497",TipoConta.POUPANCA);
        conta.deposito(200);
        conta.saque(100);
        Assert.assertEquals(100,conta.getSaldo());
    }

    //@Test(expected = RuntimeException.class)
    public void testeSaqueErro(){
        Pessoa pessoa = new Pessoa("Emily","12344097988","22/10/2000");
        Conta conta = new Conta(pessoa,"125497",TipoConta.CORRENTE);
        conta.saque(100);
        Assert.assertEquals(0,conta.getSaldo());
    }
}
