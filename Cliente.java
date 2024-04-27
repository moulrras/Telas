package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cliente {

    private JPanel panel1;
    private JTextField txtID;
    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtEmail;
    private JTextField txtTelefone;
    private JButton btnGravar;

    public Cliente() {
        JFrame frame = new JFrame("Tela de Cadastro");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel lblID = new JLabel("ID:");
        txtID = new JTextField(10);

        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField(20);

        JLabel lblCpf = new JLabel("CPF:");
        txtCpf = new JTextField(14);

        JLabel lblEmail = new JLabel("Email:");
        txtEmail = new JTextField(20);

        JLabel lblTelefone = new JLabel("Telefone:");
        txtTelefone = new JTextField(14);

        btnGravar = new JButton("Gravar");

        btnGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(txtID.getText());
                String nome = txtNome.getText();
                String cpf = txtCpf.getText();
                String email = txtEmail.getText();
                String telefone = txtTelefone.getText();

                JOptionPane.showMessageDialog(null,
                        "ID: " + id + "\n" +
                                "Nome: " + nome + "\n" +
                                "CPF: " + cpf + "\n" +
                                "Email: " + email + "\n" +
                                "Telefone: " + telefone);
            }
        });

        panel1 = new JPanel();
        panel1.add(lblID);
        panel1.add(txtID);
        panel1.add(lblNome);
        panel1.add(txtNome);
        panel1.add(lblCpf);
        panel1.add(txtCpf);
        panel1.add(lblEmail);
        panel1.add(txtEmail);
        panel1.add(lblTelefone);
        panel1.add(txtTelefone);
        panel1.add(btnGravar);

        frame.add(panel1);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Cliente();
            }
        });
    }
}

