package br.com.emilymarchetti.revisao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

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
        setStatus(StatusLocacao.ABERTA);
        veiculo.indisponibilizar();
    }

    public Locacao(Reserva reserva) {
        super(reserva.getDataRetirada(),reserva.getDataDevolucao());
        this.veiculo = reserva.getVeiculo();
        this.cliente = reserva.getCliente();
        setStatus(StatusLocacao.ABERTA);
    }

    public void fazerEntrega(Entrega entrega){
        this.entrega = entrega;
        if (getStatus() != StatusLocacao.ABERTA) {
            throw new RuntimeException();
       }
        entrega.calcularValorTotal();
        finalizarLocacao();
    }

    private void finalizarLocacao(){
        setStatus(StatusLocacao.FECHADA);
        veiculo.disponibilizar(entrega.getQuilometragemFinal());
    }

    public void cancelarLocacao(){
        if (getStatus() == StatusLocacao.FECHADA){
            throw new RuntimeException("A locação já está fechada!");
        }
            setStatus(StatusLocacao.CANCELADA);
            veiculo.disponibilizar(BigDecimal.valueOf(2000));

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
