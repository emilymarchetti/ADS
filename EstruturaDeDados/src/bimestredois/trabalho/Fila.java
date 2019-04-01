package bimestredois.trabalho;

public class Fila {

    private No ultimo;
    private No proximo;
    private int quantidade;

    public void enfileirar(Integer elemento) {
        No novoNo = new No();
        if (quantidade == 0){
            novoNo.setElemento(elemento);
            novoNo.setProximo(novoNo);
        }else{
            novoNo.setElemento(elemento);
        }
        ultimo = novoNo;
        quantidade++;
    }

    public void imprimir() {
      StringBuilder fila = new StringBuilder();
        		No noAtual = proximo;

        		if (quantidade == 0) {
        			return;
        		}

        		while (noAtual.getProximo() != null) {
        			fila.append(noAtual.getElemento());
        			fila.append(" ");
        			noAtual = noAtual.getProximo();
        		}
        		fila.append(noAtual.getElemento());
        		fila.append(" ");
        		System.out.println(fila.toString());
    }

    public void desenfilerar() {
        if (quantidade == 0){
            return;
        }else{
            proximo = proximo.getProximo();
            quantidade--;
        }

    }

    public Integer quantidadeDeElementos() {
        return quantidade;
    }
    public Integer proximo(){
        return proximo.getElemento();
    }

    public boolean vazia(){
        return quantidade == 0;
    }

}
