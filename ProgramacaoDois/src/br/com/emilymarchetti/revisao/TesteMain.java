package br.com.emilymarchetti.revisao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TesteMain {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("ARD-2232","Corsa","Sedan",
                                      "É muito bonito",2000, BigDecimal.valueOf(2000));
        Cliente cliente = new Cliente("Emily","12344097988","emilymarchetti@outlook.com",
                                      "4498415768");

        Funcionario funcionario = new Funcionario("Jeferson","1365456143669");

        Reserva reserva = new Reserva(LocalDate.of(2019,4,3),
                                      LocalDate.of(2019,4,8),veiculo,cliente);

        Locacao locacao = new Locacao(reserva);

        System.out.println("Valor Previsto da Reserva: "+ reserva.getValorPrevisto());

        Entrega entrega = new Entrega(locacao,BigDecimal.valueOf(5000),LocalDate.of(2019,4,8),funcionario);

        System.out.println("Status Locação: " + locacao.getStatus());

        Locacao locacaoTeste = new Locacao(veiculo,cliente,LocalDate.of(2019,2,3),
                LocalDate.of(2018,2,6));


        locacao.fazerEntrega(entrega);

        //locacao.cancelarLocacao();

        System.out.println("Valor final da entrega: " + entrega.getValorTotal() +
                "\n Status Locação: " + locacao.getStatus());
    }


}
