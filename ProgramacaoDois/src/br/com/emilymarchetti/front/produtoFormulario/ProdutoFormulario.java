package br.com.emilymarchetti.front.produtoFormulario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProdutoFormulario {
    private JPanel panel;
    private JTextField campoTexto;
    private JTextField campoCodigo;
    private JButton botaoImprimir;
    private JButton botaoLimpar;
    private Produto produto = new Produto();


    public JPanel getPanel() {
        return panel;
    }

    public ProdutoFormulario() {
            botaoImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if(campoTexto.getText().isEmpty() || campoCodigo.getText().isEmpty()){
                        throw new CampoVazioException();
                    }
                    produto.setCodigo(campoCodigo.getText());
                    produto.setNome(campoTexto.getText());
                    JOptionPane.showMessageDialog(null, produto.toString(),
                            "Informação do Produto",1);
                }
        });
            botaoLimpar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    campoCodigo.setText("");
                    campoTexto.setText("");
                }
            });

        }
}
