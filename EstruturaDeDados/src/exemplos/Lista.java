package exemplos;

public class Lista {
    public Integer[] elementos = new Integer[10];

    public void inserir(Integer elemento) {
        int posicaoDisponivel = 0;

                for (int i = 0; i < elementos.length; i++){
                    if (elementos[i] == null){
                        posicaoDisponivel = i;
                        break;
                    }
                }
                elementos [posicaoDisponivel] = elemento;
    }
    public void inserirPorPosicao (int posicao, Integer elemento){
        elementos[posicao] = elemento;
    }
}
