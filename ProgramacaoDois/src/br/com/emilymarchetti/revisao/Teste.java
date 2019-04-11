package br.com.emilymarchetti.revisao;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Teste {

    @Test
    public void calcularValorTotalReservaTest() {
        Cliente cliente = new Cliente("Emily", "34567845633",
                "emilymarchetti@outlook.com", "009300093");
        Funcionario funcionario = new Funcionario("L", "13456743255");
        Veiculo veiculo = new Veiculo("ARD-2232", "Corsa", "Sedan",
                "É muito bonito", 2000, BigDecimal.valueOf(2000));
        Reserva reserva = new Reserva(LocalDate.of(2019, 4, 10),
                LocalDate.of(2019, 4, 15), veiculo, cliente);
        Locacao locacao = new Locacao(reserva);
        Entrega entrega = new Entrega(locacao, BigDecimal.valueOf(2000),
                LocalDate.of(2019, 4, 15), funcionario);
        locacao.fazerEntrega(entrega);
        Assert.assertEquals(BigDecimal.valueOf(10000), entrega.getValorTotal());
    }

    @Test (expected = VeiculoIndisponivelException.class)
    public void VeiculoIndisponivelTest (){
        Cliente cliente = new Cliente("Emily", "34567845633",
                "emilymarchetti@outlook.com", "009300093");
        Funcionario funcionario = new Funcionario("L", "13456743255");
        Veiculo veiculo = new Veiculo("ARD-2232", "Corsa", "Sedan",
                "É muito bonito", 2000, BigDecimal.valueOf(2000));
        Reserva reserva = new Reserva(LocalDate.of(2019, 4, 10),
                LocalDate.of(2019, 4, 15), veiculo, cliente);
        Reserva reservaDois = new Reserva(LocalDate.of(2019, 4, 10),
                LocalDate.of(2019, 4, 15), veiculo, cliente);
    }
}
