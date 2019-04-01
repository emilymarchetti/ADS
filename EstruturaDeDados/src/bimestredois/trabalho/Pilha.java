package bimestredois.trabalho;

public class Pilha {
    private int quantidade;
    private NoDuplo primeiro;
    private NoDuplo topo;

    public void empilhar(Integer numero) {
        NoDuplo novoNo = new NoDuplo();
        novoNo.setElemento(numero);

        if (quantidade == 0) {
            primeiro = novoNo;
        } else {
            topo.setProximo(novoNo);
            novoNo.setAnterior(topo);
        }
        topo = novoNo;
        quantidade++;
    }

    public void desempilhar(){
        if(quantidade == 0) {
            return;
        }
        if (topo.getAnterior() != null) {
            topo = topo.getAnterior();
        }
        topo.setProximo(null);
        quantidade--;
    }

    public int retornarQuantidade() {
            return quantidade;
    }

    public void imprimir() {
        StringBuilder pilha = new StringBuilder();
        NoDuplo noAtual = primeiro;

        if (quantidade == 0) {
            System.out.println("[ ]");
        } else {
            while (noAtual.getProximo() != null) {
                pilha.append(noAtual.getElemento());
                pilha.append(" ");
                noAtual = noAtual.getProximo();
            }
            pilha.append(noAtual.getElemento());
            pilha.append(" ");
            System.out.println(pilha.toString());
        }
    }
}
