package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Funcionario {

    private JPanel panel1;
    private JTextField txtNome;
    private JTextField txtCargo;
    private JTextField txtSalario;
    private JTextField txtDataInicio;
    private JTextField txtTurno;
    private JButton btnGravar;

    public Funcionario() {
        JFrame frame = new JFrame("Cadastro de Funcionário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField(20);

        JLabel lblCargo = new JLabel("Cargo:");
        txtCargo = new JTextField(20);

        JLabel lblSalario = new JLabel("Salário:");
        txtSalario = new JTextField(10);

        JLabel lblDataInicio = new JLabel("Data de Início:");
        txtDataInicio = new JTextField(10);

        JLabel lblTurno = new JLabel("Turno:");
        txtTurno = new JTextField(10);

        btnGravar = new JButton("Gravar");

        btnGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String cargo = txtCargo.getText();
                String salario = txtSalario.getText();
                String dataInicio = txtDataInicio.getText();
                String turno = txtTurno.getText();

                JOptionPane.showMessageDialog(null,
                        "Nome: " + nome + "\n" +
                                "Cargo: " + cargo + "\n" +
                                "Salário: " + salario + "\n" +
                                "Data de Início: " + dataInicio + "\n" +
                                "Turno: " + turno);
            }
        });

        panel1 = new JPanel();
        panel1.add(lblNome);
        panel1.add(txtNome);
        panel1.add(lblCargo);
        panel1.add(txtCargo);
        panel1.add(lblSalario);
        panel1.add(txtSalario);
        panel1.add(lblDataInicio);
        panel1.add(txtDataInicio);
        panel1.add(lblTurno);
        panel1.add(txtTurno);
        panel1.add(btnGravar);

        frame.add(panel1);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Funcionario();
            }
        });
    }
}
