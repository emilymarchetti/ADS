package bimestredois.trabalho;

public class TesteArvore {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        NoArvore raizLive = arvore.criarArvore("B");
        NoArvore linha1 = arvore.inserirNo(raizLive, "B1");
        NoArvore linha2 = arvore.inserirNo(linha1, "B1.1");
        arvore.inserirNo(linha2, "B1.1.2");
        arvore.inserirNo(linha1, "B1.2");

        arvore.inserirNo(raizLive, "B2");

        linha1 = arvore.inserirNo(raizLive, "B3");
        arvore.inserirNo(linha1, "B3.1");
        arvore.inserirNo(linha1, "B3.2");
        arvore.inserirNo(linha1, "B3.3");

        arvore.imprimir();

        arvore.removerNo(null);
        arvore.imprimir();

        arvore.retornarQuantidade();
    }

}

