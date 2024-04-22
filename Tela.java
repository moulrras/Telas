import Classes.Clientes;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal {

    private JPanel panel1;
    private JTextField textField1;
    private JTextField txtCpf;
    private JTextField txtID;
    private JTextField txtEmail;
    private JButton btnGravar;
    private JLabel lblNome;
    private JLabel lblCpf;
    private JLabel lblID;
    private JLabel lblEmail;
    private JTextField txtNome;

    public TelaPrincipal() {
        btnGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(txtID.getText());
                String nome = txtNome.getText();
                String cpf = txtCpf.getText();
                String email = txtEmail.getText();

                Clientes cli1 = new Clientes();
                cli1.setId(id);
                cli1.setNome(nome);
                cli1.setCpf(cpf);
                cli1.setEmail(email);

                JOptionPane.showMessageDialog(null,
                        "ID: " + cli1.getId() + "\n" +
                        "Nome: " + cli1.getNome() + "\n" +
                        "CPF: " + cli1.getCpf() + "\n" +
                        "Email: " + cli1.getEmail());
            }
        });
    }
}
