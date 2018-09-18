package exercicios;

public class Lista {
    private Integer[] lista = new Integer[10];
    private int posicaoDisponivel = 0;

    public void inserirPorPosicao (int posicao,int elemento){
            lista[posicao] = elemento;
        }
        public void inserirPorElemento (int elemento){
                lista [posicaoDisponivel] = elemento;
                posicaoDisponivel++;
        }
        public void removerPorPosicao (int posicao){
                lista [posicao] = null;
        }
        public void removerPorElemento (int elemento){
                for (int i = 0; i < lista.length; i++){
                    if (lista[i] == elemento){
                        lista [i] = null;
                        break;
                    }
                }
        }
        public void retornarElementoPorPosicao (int posicao){
            System.out.println(+lista[posicao]);
        }
        public int quantidadeElementos (){
            int q = 0;
            for (int i = 0; i < lista.length; i++){
                if (lista[i] != null){
                    q++;
                }
            }
            return q;
        }
        public void listaCheia (){
            if (posicaoDisponivel == lista.length){
                System.out.println("Lista cheia!");
            }else{
                System.out.println("Lista não está cheia");
            }
        }
        public void listaVazia (){
            if (posicaoDisponivel == 0){
                System.out.println("Lista vazia!");
            }
        }
        public void imprimirLista (){
        for (int i= 0; i < lista.length; i++){
            if (lista[i] != null){
                System.out.println(lista[i]);
            }
        }
    }
}







