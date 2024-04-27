import Classes.Produtos;
import Classes.Fornecedor;
import Classes.Funcionario;
import Classes.Cliente;
import Classes.Endereco;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal {

    public TelaPrincipal() {
        JFrame frame = new JFrame("Tela Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuCadastro = new JMenu("Cadastro");

        JMenuItem cadastroClientesItem = new JMenuItem("Cadastro de Clientes");
        JMenuItem cadastroFornecedoresItem = new JMenuItem("Cadastro de Fornecedores");
        JMenuItem cadastroFuncionariosItem = new JMenuItem("Cadastro de Funcionários");
        JMenuItem cadastroEnderecoItem = new JMenuItem("Cadastro de Endereços");
        JMenuItem cadastroProdutosItem = new JMenuItem("Cadastro de Produtos");

        cadastroClientesItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Cliente();
            }
        });

        cadastroFornecedoresItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Fornecedor();
            }
        });

        cadastroFuncionariosItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Funcionario();
            }
        });

        cadastroEnderecoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Endereco();
            }
        });

        cadastroProdutosItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Produtos();
            }
        });

        menuCadastro.add(cadastroClientesItem);
        menuCadastro.add(cadastroFornecedoresItem);
        menuCadastro.add(cadastroFuncionariosItem);
        menuCadastro.add(cadastroEnderecoItem);
        menuCadastro.add(cadastroProdutosItem);

        menuBar.add(menuCadastro);

        JMenu menuSair = new JMenu("Sair");
        JMenuItem sairItem = new JMenuItem("Sair do Programa");
        sairItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menuSair.add(sairItem);
        menuBar.add(menuSair);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal();
            }
        });
    }
}
