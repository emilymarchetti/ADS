package exercicios;

public class Fila {

    private Integer[] fila = new Integer[20];
    private int proximaPosicao = 0;

    public void enfileirar(int elemento) {
        fila[proximaPosicao] = elemento;
        proximaPosicao++;
    }

    public void imprimir() {
        String print = "[ ";
        for (int i = 0; i < proximaPosicao; i++) {
            if (fila[i] != null) {
                print = print + fila[i] + " ";
            }
        }
        System.out.println(print +"]");
    }

    public void desenfilerar() {
        for (int i = 0; i < proximaPosicao - 1; i++) {
            fila[i] = fila[i + 1];
        }
        fila[proximaPosicao - 1] = null;
        proximaPosicao--;
    }

    public Integer quantidadeDeElementos() {
        return proximaPosicao;
    }
    public Integer proximo(){
        return fila[0];
    }
    public boolean cheia(){
        return proximaPosicao == fila.length;
    }
    public boolean vazia(){
        return proximaPosicao == 0;
    }
}
