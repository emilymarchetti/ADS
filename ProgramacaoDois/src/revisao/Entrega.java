package revisao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Entrega{

    private Locacao locacao;
    private BigDecimal quilometragemFinal;
    private LocalDate dataEntrega;
    private Funcionario funcionario;
    private long valorTotal;

    public Entrega(Locacao locacao, BigDecimal quilometragemFinal, LocalDate dataEntrega, Funcionario funcionario) {
        this.quilometragemFinal = quilometragemFinal;
        this.dataEntrega = dataEntrega;
        this.funcionario = funcionario;
        this.locacao = locacao;
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

    public long getValorTotal() {
        return valorTotal;
    }

    protected void setValorTotal(long valorTotal) {
        this.valorTotal = valorTotal;
    }
}
