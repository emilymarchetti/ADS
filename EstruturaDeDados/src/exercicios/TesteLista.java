package exercicios;

//        a.	inserir 2 elementos na lista,
//        b.	inserir 3 elementos por posição,
//        c.	remover o elemento da posição 1,
//        d.	remover um elemento informado anteriormente;
//        e.	apresentar a quantidade de elementos da lista,
//        f.	verificar se a lista está cheia,
//        g.	apresentar o valor da primeira posição da lista
//        h.	imprimir a lista.

public class TesteLista {

    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.inserirPorElemento(5);
        lista.inserirPorElemento(10);
        lista.inserirPorPosicao(2,30);
        lista.inserirPorPosicao(3,40);
        lista.inserirPorPosicao(4,50);
        lista.removerPorPosicao(1);
        System.out.println(lista.quantidadeElementos());
        System.out.println();
        lista.listaCheia();
        System.out.println();
        lista.retornarElementoPorPosicao(0);
        System.out.println();
        lista.imprimirLista();



    }
}
