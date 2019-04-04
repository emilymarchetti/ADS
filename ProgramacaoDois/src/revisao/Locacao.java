package revisao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Locacao extends Data {

    private Veiculo veiculo;
    private Cliente cliente;
    private BigDecimal quilometragemInicial;
    private StatusLocacao status;
    private Reserva reserva;
    private Entrega entrega;

    public Locacao(Veiculo veiculo, Cliente cliente,
                   LocalDate dataRetirada, LocalDate dataDevolucao) {
        super(dataRetirada,dataDevolucao);
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.quilometragemInicial = veiculo.getQuilometragem();
        setStatus(StatusLocacao.ABERTA);

        if (veiculo.isDisponivel()) {
            veiculo.setDisponivel(false);
        } else {
            throw new RuntimeException();
        }
    }

    public Locacao(Reserva reserva,
                   LocalDate dataDevolucao) {
        super(null,dataDevolucao);
        this.quilometragemInicial = veiculo.getQuilometragem();
        this.reserva = reserva;
        this.veiculo = reserva.getVeiculo();
        this.cliente = reserva.getCliente();
    }

    public void fazerEntrega(Entrega entrega){
        this.entrega = entrega;
        if (entrega.getDataEntrega() == getDataDevolucao()){
            entrega.setValorTotal(getReserva().getValorPrevisto());
        }else{
            long quantidadeDias = ChronoUnit.DAYS.between(reserva.getDataRetirada(), entrega.getDataEntrega());
            entrega.setValorTotal(quantidadeDias*veiculo.getValorDiaria());
        }
        finalizarLocacao();
    }

    private void finalizarLocacao(){
        setStatus(StatusLocacao.FECHADA);
        getVeiculo().setQuilometragem(entrega.getQuilometragemFinal());
        veiculo.setDisponivel(true);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public BigDecimal getQuilometragemInicial() {
        return quilometragemInicial;
    }

    public StatusLocacao getStatus() {
        return status;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setStatus(StatusLocacao status) {
        this.status = status;
    }

    public Entrega getEntrega() {
        return entrega;
    }
}
