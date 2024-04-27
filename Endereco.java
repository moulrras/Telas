package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Endereco {

    private JPanel panel1;
    private JTextField txtRua;
    private JTextField txtNumero;
    private JTextField txtCasaOuApto;
    private JTextField txtBairro;
    private JTextField txtCEP;
    private JButton btnGravar;

    public Endereco() {
        JFrame frame = new JFrame("Tela de Cadastro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblRua = new JLabel("Rua:");
        txtRua = new JTextField(20);

        JLabel lblNumero = new JLabel("Número:");
        txtNumero = new JTextField(10);

        JLabel lblCasaOuApto = new JLabel("Casa ou Apto:");
        txtCasaOuApto = new JTextField(10);

        JLabel lblBairro = new JLabel("Bairro:");
        txtBairro = new JTextField(20);

        JLabel lblCEP = new JLabel("CEP:");
        txtCEP = new JTextField(10);

        btnGravar = new JButton("Gravar");

        btnGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rua = txtRua.getText();
                String numero = txtNumero.getText();
                String casaOuApto = txtCasaOuApto.getText();
                String bairro = txtBairro.getText();
                String cep = txtCEP.getText();

                JOptionPane.showMessageDialog(null,
                        "Rua: " + rua + "\n" +
                                "Número: " + numero + "\n" +
                                "Casa ou Apto: " + casaOuApto + "\n" +
                                "Bairro: " + bairro + "\n" +
                                "CEP: " + cep);
            }
        });

        panel1 = new JPanel();
        panel1.add(lblRua);
        panel1.add(txtRua);
        panel1.add(lblNumero);
        panel1.add(txtNumero);
        panel1.add(lblCasaOuApto);
        panel1.add(txtCasaOuApto);
        panel1.add(lblBairro);
        panel1.add(txtBairro);
        panel1.add(lblCEP);
        panel1.add(txtCEP);
        panel1.add(btnGravar);

        frame.add(panel1);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Endereco();
            }
        });
    }
}

