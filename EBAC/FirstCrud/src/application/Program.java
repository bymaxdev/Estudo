package application;

import entities.ClientMapDAO;
import entities.Cliente;
import entities.IClienteDAO;

import javax.swing.*;

public class Program{

    private static String opcao;

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClientMapDAO();

        opcoes();

        while (!isValid(opcao)) {
            if("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,"Digite 1  para cadastrar, 2 para consultar, 3 para exclusão, 4 para alterar ou 5 para sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isValid(opcao)) {
            if (isSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separado por virgula: Nome, CPF, Telefone, Endereco, Numero, Cidade, Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if(isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF do cliente que deseja consultar: ", "Consulta", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if(isExcluir(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF que deseja excluir: ", "Excluir", JOptionPane.INFORMATION_MESSAGE);
                delete(dados);
            }else if (isAlterar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF do cliente que deseja Alterar: ", "Alterar", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            }
            opcoes();
        }
    }

    private static void delete(String dados) {
        Boolean valid = isValidCpf(dados);
        iClienteDAO.excluir(Long.valueOf(dados));
        if(valid) {
            JOptionPane.showMessageDialog(null, "Deletado","Excluir", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Digite um CPF valido", "Excluir", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static void alterar(String dados) {
        Boolean valid = isValidCpf(dados);
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if(valid && cliente != null) {
            String newData = JOptionPane.showInputDialog(null,"Digite os dados do cliente separado por virgula: Nome, CPF, Telefone, Endereco, Numero, Cidade, Estado",
                    "Alterar", JOptionPane.INFORMATION_MESSAGE);
            String[] splitData = newData.split(",");
            Cliente newClient = new Cliente(splitData[0], splitData[1], splitData[2], splitData[3], splitData[4], splitData[5], splitData[6]);
            iClienteDAO.alterar(newClient);
        } else {
            JOptionPane.showMessageDialog(null, "Digite somente um CPF valido!", "Consultar", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static Boolean isValidCpf(String dados) {
        return dados != null && dados.matches("^\\d+$");
    }

    private static void consultar(String dados) {
        Boolean valid = isValidCpf(dados);
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if(valid && cliente != null) {
            JOptionPane.showMessageDialog(null, iClienteDAO.consultar(Long.parseLong(dados)), "Consulta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Digite somente um CPF valido!", "Consultar", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static String opcoes() {
        opcao = JOptionPane.showInputDialog(null,"Digite 1  para cadastrar, 2 para consultar, 3 para exclusão, 4 para alterar ou 5 para sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        return opcao;
    }

    private static void cadastrar(String dados) {
        String[] splitData = dados.split(",");

        Cliente cliente = new Cliente(splitData[0], splitData[1], splitData[2], splitData[3], splitData[4], splitData[5], splitData[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);

        if(isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Clientge já se encontra cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastro(String opcao) {
        return opcao.equals("1");
    }

    private static boolean isConsultar(String opcao) {
        return opcao.equals("2");
    }

    private static boolean isExcluir(String opcao) {
        return opcao.equals("3");
    }

    private static boolean isAlterar(String opcao) {
        return opcao.equals("4");
    }

    private static boolean isSair(String opcao) {
        return opcao.equals("5");
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até Logo.", "Erro", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isValid(String opcao) {
        return opcao.equals("1") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4") || opcao.equals("5");
    }
}
