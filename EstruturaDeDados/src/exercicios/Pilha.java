package exercicios;

public class Pilha {

    private Integer [] pilha = new Integer [20];
    private Integer topo = null;

    public void empilhar (Integer elemento){
        if(topo == null) {
            topo = 0;
        } else {
            topo = topo + 1;
        }

        if(topo >= pilha.length) {
            System.out.println("");

        }

        pilha[topo] = elemento;
    }
    public Integer desempilhar (){
        if(topo == null) {
            return null;
        }

        Integer elementoDesempilhado = pilha[topo];
        pilha [topo] = null;
        if(topo > 0) {
            topo = topo - 1;
        } else {
            topo = null;
        }

        return elementoDesempilhado;
    }

    public void imprimir (){
        String elementos = "[ ";

        for (int i = 0; i < pilha.length; i++) {
            if (pilha[i] != null) {
                elementos = elementos + pilha[i] + " ";
            }
        }

        elementos = elementos + "]";

        System.out.println(elementos);
    }
}
