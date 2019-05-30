package br.com.emilymarchetti.front.produtoFormulario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProdutoFormulario {
    private JPanel panel;
    private JTextField campoCodigo;
    private JTextField campoNome;
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
                    if(campoCodigo.getText().isEmpty() || campoNome.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, CampoVazioException.getMENSAGE(),
                                "Atenção",1);
                        return;
                    }
                    produto.setCodigo(campoCodigo.getText());
                    produto.setNome(campoNome.getText());
                    JOptionPane.showMessageDialog(null, produto.toString(),
                            "Informação do Produto",1);
                }
        });
            botaoLimpar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    campoNome.setText("");
                    campoCodigo.setText("");
                }
            });

        }
}
