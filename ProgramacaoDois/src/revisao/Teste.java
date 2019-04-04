package revisao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("ARD-2232","Corsa","Sedan",
                                      "É muito bonito",2000, BigDecimal.valueOf(2000));
        Cliente cliente = new Cliente("Emily","12344097988","emilymarchetti@outlook.com",
                                      "4498415768");

        Reserva reserva = new Reserva(LocalDate.of(2019,04,03),
                                      LocalDate.of(2019,04,8),veiculo,cliente);
        //Locacao locacao = new Locacao(veiculo,cliente, LocalDate.of(2019,04,03),
                                      //LocalDate.of(2019,04,8));

        //Locacao locacao = new Locacao(reserva,);


    }
}
