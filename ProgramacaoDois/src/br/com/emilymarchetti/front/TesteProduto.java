package br.com.emilymarchetti.front;

import javax.swing.*;

public class TesteProduto {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Cadastro de Produto");

        ProdutoFormulario produtoFormulario = new ProdutoFormulario();

        jFrame.setContentPane(produtoFormulario.getPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.pack();
    }
}
