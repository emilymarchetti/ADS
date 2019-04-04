package revisao;

import java.time.LocalDate;

public abstract class Data {

    private LocalDate dataReserva;
    protected LocalDate dataRetirada;
    private LocalDate dataDevolucao;

    public Data(LocalDate dataRetirada, LocalDate dataDevolucao) {
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    protected void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }
}
