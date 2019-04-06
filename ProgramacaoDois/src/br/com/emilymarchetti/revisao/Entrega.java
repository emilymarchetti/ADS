package br.com.emilymarchetti.revisao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Entrega{

    private Locacao locacao;
    private BigDecimal quilometragemFinal;
    private LocalDate dataEntrega;
    private Funcionario funcionario;
    private BigDecimal valorTotal;

    public Entrega(Locacao locacao, BigDecimal quilometragemFinal, LocalDate dataEntrega, Funcionario funcionario) {
        this.locacao = locacao;
        this.quilometragemFinal = quilometragemFinal;
        this.dataEntrega = dataEntrega;
        this.funcionario = funcionario;
    }

    public BigDecimal calcularValorTotal() {
        if (getDataEntrega() == locacao.getDataDevolucao()) {
            this.valorTotal = BigDecimal.valueOf (locacao.getReserva().getValorPrevisto());
        } else {
            BigDecimal quantidadeDias = BigDecimal.valueOf(ChronoUnit.DAYS.between(locacao.getDataRetirada(), getDataEntrega()))   ;
            valorTotal = quantidadeDias.multiply(BigDecimal.valueOf(locacao.getVeiculo().getValorDiaria()));
        }
        return valorTotal;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public BigDecimal getQuilometragemFinal() {
        return quilometragemFinal;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

}
