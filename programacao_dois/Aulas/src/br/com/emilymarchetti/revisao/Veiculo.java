package br.com.emilymarchetti.revisao;

import java.math.BigDecimal;

public class Veiculo {

    private String placa;
    private String nome;
    private String modelo;
    private String descricao;
    private long valorDiaria;
    private BigDecimal quilometragem;
    private boolean disponivel;

    public Veiculo(String placa, String nome, String modelo,
                   String descricao, long valorDiaria, BigDecimal quilometragem) {
        this.placa = placa;
        this.nome = nome;
        this.modelo = modelo;
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
        this.quilometragem = quilometragem;
        disponibilizar(BigDecimal.valueOf(2000));
    }

    public void disponibilizar(BigDecimal quilometragem){
        if (!isDisponivel()) {
            setDisponivel(true);
        } else {
            throw new RuntimeException();
        }
        this.quilometragem = quilometragem;
    }

    public void indisponibilizar(){
        if (isDisponivel()) {
            setDisponivel(false);
        } else {
            throw new VeiculoIndisponivelException();
        }
    }

    public String getPlaca() {
        return placa;
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public long getValorDiaria() {
        return valorDiaria;
    }

    public BigDecimal getQuilometragem() {
        return quilometragem;
    }

    public boolean isDisponivel() { return disponivel; }

    protected void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    protected void setQuilometragem(BigDecimal quilometragem) {
        this.quilometragem = quilometragem;
    }
}
