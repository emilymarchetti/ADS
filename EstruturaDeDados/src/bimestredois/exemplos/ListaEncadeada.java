package bimestredois.exemplos;

public class ListaEncadeada {

    No no = new No(elemento, primeiro);

    private No primeiro;
    private No ultimo;
    private int quantidade;

    public void inserirInicio(Integer elemento) {
        No no = new No();
        no.setElemento(elemento);
        no.setProximo(primeiro);
        primeiro = no;

        if (quantidade == 0) {
            ultimo = primeiro;
        }

        quantidade++;
    }

    public void inserirFim(Integer elemento) {
        if (quantidade == 0) {
            inserirInicio(elemento);
        }
        No no = new No();
        no.setElemento(elemento);

        ultimo.setProximo(no);
        ultimo = no;
        quantidade++;

//        } else {
//            No no = new No(elemento, null);
//            ultimo.setProximo(no);
//            ultimo = no;
//            quantidade++;
//        }
    }

    public void inserirNaPosicao(int posicao, Integer elemento) {
        if (quantidade == 0) {
            inserirNoInicio(elemento);
        } else if (posicao == quantidade) {
            inserirNoFinal(elemento);
        } else {
            No noNaPosicaoAnterior = buscarNoPorPosicao(posicao - 1);
            No no = new NoEncadeado(elemento, noNaPosicaoAnterior.getProximo());
            noNaPosicaoAnterior.setProximo(no);
            quantidade++;
        }
    }

    public No buscaPosicao(int posicao) {
        if (!(posicao >= 0 && posicao < quantidade)) {
            throw new RuntimeException("Posição não existente");
        }
        No atual = primeiro;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public void removerInicio (){
        if (quantidade == 0){
            return;
        }
    }
}
