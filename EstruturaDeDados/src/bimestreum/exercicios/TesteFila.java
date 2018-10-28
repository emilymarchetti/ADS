package exercicios;

public class TesteFila {

    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.vazia();
        fila.enfileirar(5);
        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.enfileirar(40);
        fila.desenfilerar();
        fila.desenfilerar();
        fila.proximo();
        fila.quantidadeDeElementos();
        fila.imprimir();
    }
}