package exercicios;

public class Lista {
    private Integer[] lista = new Integer[10];
    private int posicaoDisponivel = 0;
    private int cont = 0;

    public void inserirPorPosicao(int posicao, int elemento) {
        lista[posicao] = elemento;
        cont++;
    }

    public void inserirPorElemento(int elemento) {
        for (int i = 0; i < lista.length; i++){
            if (lista[i] == null){
                posicaoDisponivel = i;
                break;
            }
        }
        lista[posicaoDisponivel] = elemento;
        cont++;
    }

    public Integer removerPorPosicao(int posicao) {
        cont--;
        return lista[posicao] = null;
    }

    public void removerPorElemento(Integer elemento) {
        Integer j = null;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == elemento && lista[i] != null) {
                j = i;
                break;
            }
        }
        removerPorPosicao(j);
    }

    public Integer retornarElementoPorPosicao(int posicao) {
        return lista[posicao];
    }

    public int quantidadeElementos() {
        return cont;
    }

    public boolean listaCheia() {
        return cont == lista.length;
    }

    public boolean listaVazia() {
        return cont == 0;
    }
    public void imprimirLista() {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                System.out.println(lista[i]);
            }
        }
    }
}







