package bimestreum.exercicios;

public class TestePilha {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        pilha.desempilhar();
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(40);
        pilha.empilhar(50);
        pilha.empilhar(60);
        pilha.empilhar(70);
        pilha.empilhar(80);
        pilha.empilhar(90);
        pilha.empilhar(100);
        pilha.empilhar(pilha.retornarTopo());
        pilha.desempilhar();
        pilha.desempilhar();
        System.out.println("O topo é "+ pilha.retornarTopo());
        System.out.println();
        System.out.println("Elementos: "+ pilha.quantidadeElementos());
        System.out.println();
        pilha.imprimir();

    }
}
