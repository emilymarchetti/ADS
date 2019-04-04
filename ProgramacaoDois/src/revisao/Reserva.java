package revisao;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva extends Data {

    private Veiculo veiculo;
    private Cliente cliente;
    private long valorPrevisto;

    public Reserva(LocalDate dataRetirada, LocalDate dataDevolucao,
                   Veiculo veiculo, Cliente cliente) {
        super(dataRetirada,dataDevolucao);
        this.veiculo = veiculo;
        this.cliente = cliente;
    }

    public void fazerReserva(){
        setDataReserva(LocalDate.now());
        long quantidadeDias = ChronoUnit.DAYS.between(getDataRetirada(), getDataDevolucao());
        long valorPrevisto = quantidadeDias*veiculo.getValorDiaria();
        if (veiculo.isDisponivel() == true){
            veiculo.setDisponivel(false);
        }else{
            throw new RuntimeException();
        }
        this.valorPrevisto = valorPrevisto;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public long getValorPrevisto() {
        return valorPrevisto;
    }
}
