package bimestredois.trabalho;

import java.util.LinkedList;

public class Arvore {
    private NoArvore raiz;
    private int quantidade;

    public NoArvore criarArvore(String elemento) {
        raiz = new NoArvore();
        raiz.setElemento(elemento);
        raiz.setPai(null);
        quantidade++;
        return raiz;
    }

    public NoArvore inserirNo(NoArvore pai, String elemento) {
        NoArvore novoNo = new NoArvore();
        novoNo.setElemento(elemento);
        novoNo.setPai(pai);

        if (pai.getFilhos() == null) {
            pai.setFilhos(new LinkedList<>());
        }
        pai.getFilhos().add(novoNo);

        return novoNo;
    }

    public void removerNo(NoArvore pai) {
        pai.setFilhos(null);
    }

    public int retornarQuantidade() {
        return quantidade;
    }

    private int contaFilhos(NoArvore pai, int quantidade) {
        if (pai.getFilhos() != null) {
            for (NoArvore noFilho : pai.getFilhos()) {
                if (noFilho.getElemento() != null) {
                    quantidade++;
                }
                quantidade = +contaFilhos(noFilho, quantidade);
            }
        }
        return quantidade;
    }

    public void imprimir() {
        if (raiz == null) {
            System.out.println("( )");
        }

        StringBuilder arvore = new StringBuilder();
        arvore.append("(");
        arvore.append(raiz.getElemento());
        apresentaFilhos(raiz, arvore);
        arvore.append(")");

        System.out.println(arvore.toString());
    }

    private void apresentaFilhos(NoArvore pai, StringBuilder sFilhos) {
        if (pai.getFilhos() != null) {
            for (NoArvore noFilho : pai.getFilhos()) {
                sFilhos.append("(");
                sFilhos.append(noFilho.getElemento());
                apresentaFilhos(noFilho, sFilhos);
                sFilhos.append(")");
            }
        }
    }
}
