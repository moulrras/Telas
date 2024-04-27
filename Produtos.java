package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Produtos {

    private JPanel panel1;
    private JTextField txtNomeProduto;
    private JTextField txtMarca;
    private JTextField txtPreco;
    private JTextField txtQntEstoque;
    private JTextField txtDemanda;
    private JButton btnGravar;

    public Produtos() {
        JFrame frame = new JFrame("Tela de Cadastro de Produto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblNomeProduto = new JLabel("Nome do Produto:");
        txtNomeProduto = new JTextField(20);

        JLabel lblMarca = new JLabel("Marca:");
        txtMarca = new JTextField(20);

        JLabel lblPreco = new JLabel("Preço:");
        txtPreco = new JTextField(10);

        JLabel lblQntEstoque = new JLabel("Quantidade no Estoque:");
        txtQntEstoque = new JTextField(10);

        JLabel lblDemanda = new JLabel("Demanda:");
        txtDemanda = new JTextField(10);

        btnGravar = new JButton("Gravar");

        btnGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeProduto = txtNomeProduto.getText();
                String marca = txtMarca.getText();
                double preco = Double.parseDouble(txtPreco.getText());
                int qntEstoque = Integer.parseInt(txtQntEstoque.getText());
                String demanda = txtDemanda.getText();

                JOptionPane.showMessageDialog(null,
                        "Nome do Produto: " + nomeProduto + "\n" +
                                "Marca: " + marca + "\n" +
                                "Preço: $" + preco + "\n" +
                                "Quantidade no Estoque: " + qntEstoque + "\n" +
                                "Demanda: " + demanda);
            }
        });

        panel1 = new JPanel();
        panel1.add(lblNomeProduto);
        panel1.add(txtNomeProduto);
        panel1.add(lblMarca);
        panel1.add(txtMarca);
        panel1.add(lblPreco);
        panel1.add(txtPreco);
        panel1.add(lblQntEstoque);
        panel1.add(txtQntEstoque);
        panel1.add(lblDemanda);
        panel1.add(txtDemanda);
        panel1.add(btnGravar);

        frame.add(panel1);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Produtos();
            }
        });
    }
}
