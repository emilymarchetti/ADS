/*package br.com.emilymarchetti.exercicios.exDois;

import Pessoa;
import org.junit.Assert;
import org.junit.TesteFor;

public class TesteConta {

    @TesteFor

    public void testeDeposito (){
        Pessoa pessoa = new Pessoa("Emily","12344097988","22/10/2000");
        Conta conta = new Conta(pessoa,"125497",TipoConta.CORRENTE);
        conta.deposito(20);
        Assert.assertEquals(20,conta.getSaldo());
    }

    @TesteFor
    public void testeSaque(){
        Pessoa pessoa = new Pessoa("Emily","12344097988","22/10/2000");
        Conta conta = new Conta(pessoa,"125497",TipoConta.POUPANCA);
        conta.deposito(200);
        conta.saque(100);
        Assert.assertEquals(100,conta.getSaldo());
    }

    //@TesteFor(expected = RuntimeException.class)
    public void testeSaqueErro(){
        Pessoa pessoa = new Pessoa("Emily","12344097988","22/10/2000");
        Conta conta = new Conta(pessoa,"125497",TipoConta.CORRENTE);
        conta.saque(100);
        Assert.assertEquals(0,conta.getSaldo());
    }
}
*/