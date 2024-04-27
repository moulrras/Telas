package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fornecedor {

    private JPanel panel1;
    private JTextField txtNome;
    private JTextField txtEmail;
    private JTextField txtTelefone;
    private JTextField txtProdutoFornecido;
    private JTextField txtLocal;
    private JButton btnGravar;

    public Fornecedor() {
        JFrame frame = new JFrame("Cadastro de Fornecedor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField(20);

        JLabel lblEmail = new JLabel("Email:");
        txtEmail = new JTextField(20);

        JLabel lblTelefone = new JLabel("Telefone:");
        txtTelefone = new JTextField(10);

        JLabel lblProdutoFornecido = new JLabel("Produto Fornecido:");
        txtProdutoFornecido = new JTextField(20);

        JLabel lblLocal = new JLabel("Local:");
        txtLocal = new JTextField(20);

        btnGravar = new JButton("Gravar");

        btnGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String email = txtEmail.getText();
                String telefone = txtTelefone.getText();
                String produtoFornecido = txtProdutoFornecido.getText();
                String local = txtLocal.getText();

                JOptionPane.showMessageDialog(null,
                        "Nome: " + nome + "\n" +
                                "Email: " + email + "\n" +
                                "Telefone: " + telefone + "\n" +
                                "Produto Fornecido: " + produtoFornecido + "\n" +
                                "Local: " + local);
            }
        });

        panel1 = new JPanel();
        panel1.add(lblNome);
        panel1.add(txtNome);
        panel1.add(lblEmail);
        panel1.add(txtEmail);
        panel1.add(lblTelefone);
        panel1.add(txtTelefone);
        panel1.add(lblProdutoFornecido);
        panel1.add(txtProdutoFornecido);
        panel1.add(lblLocal);
        panel1.add(txtLocal);
        panel1.add(btnGravar);

        frame.add(panel1);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Fornecedor();
            }
        });
    }
}
