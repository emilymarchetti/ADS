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

    public void quantidadeDeElementos() {
        System.out.println("Na fila contém "+proximaPosicao+" elementos");
    }
    public void proximo(){
        System.out.println("O próximo da fila é "+fila[0]);
    }
    public void cheia(){
        if (proximaPosicao == fila.length){
            System.out.println("A fila está cheia");
        }else{
            System.out.println("A fila não está cheia ");
        }
    }public void vazia(){
        if (proximaPosicao == 0){
            System.out.println("A fila está vazia");
        }else{
            System.out.println("A fila não está vazia ");
        }
    }
}
