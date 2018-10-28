package exercicios;

public class TesteLista {

    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.inserirPorElemento(5);
        lista.inserirPorElemento(10);
        lista.inserirPorPosicao(2,30);
        lista.inserirPorPosicao(3,40);
        lista.inserirPorPosicao(4,55);
        lista.removerPorPosicao(1);
        lista.removerPorElemento(40);
        System.out.println("Elementos: " + lista.quantidadeElementos());
        System.out.println();
        lista.listaCheia();
        System.out.println();
        System.out.println(lista.retornarElementoPorPosicao(0));
        System.out.println();
        lista.imprimirLista();
    }
}
