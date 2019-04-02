package exTres;

public class Processo {

    private String num_processo;
    private Tribunal tribunal;
    private Vara vara;
    private Cliente cliente;
    private Cliente clienteCont;
    private String descricao;
    private Secretaria secretaria;
    private Advogado advogado;


    public Processo(String num_processo, Tribunal tribunal, Vara vara,
                    Cliente cliente, Cliente clienteCont, String descricao, Secretaria secretaria, Advogado advogado) {
        this.num_processo = num_processo;
        this.tribunal = tribunal;
        this.vara = vara;
        this.cliente = cliente;
        this.clienteCont = clienteCont;
        this.descricao = descricao;
        this.secretaria = secretaria;
        this.advogado = advogado;
    }
}
