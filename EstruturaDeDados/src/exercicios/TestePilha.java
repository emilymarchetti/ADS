package exercicios;

public class TestePilha {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(40);
        pilha.desempilhar();
        pilha.imprimir();

    }
}
