package bimestreum.exercicios;

public class Pilha {

    private Integer[] pilha = new Integer[10];
    public Integer topo = null;

    public void empilhar(Integer elemento) {
        if (topo == null) {
            topo = 0;
            pilha[topo++] = elemento;
        } else if (topo == pilha.length -1) {
            return;
        } else {
            pilha[topo++] = elemento;
        }
    }

    public void desempilhar() {
        if (topo == null) {
            return;
        }
        pilha[topo] = null;
        if (topo > 0) {
            topo--;
        } else {
            topo = null;
        }
    }

    public void imprimir() {
        for (int i = topo; i >= 0; i--) {
            if (pilha[i] != null) {
                System.out.println("  " + pilha[i]);
                System.out.println("-------");
            }
        }
    }

    public Integer retornarTopo (){
        return pilha [topo];
    }
    public Integer quantidadeElementos() {
        return topo + 1;
    }

    public void cheia() {
        if (topo == pilha.length) {
            System.out.println("A pilha está cheia");
        } else {
            System.out.println("A pilha não está cheia");
        }
    }

    public void vazia() {
        if (topo == null) {
            System.out.println("A pilha está vazia");
        } else {
            System.out.println("A pilha não está vazia");
        }
    }
}