package application;

import entities.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        List<Funcionarios> funcionariosList = new ArrayList<>();

        System.out.print("Quantos funcionários deseja registar? ");
        int nFunc = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < nFunc; i++) {
            System.out.println(" ");
            System.out.printf("Funcionário %d:%n",i +1);
            System.out.print("ID: ");
            int id = entrada.nextInt();
            while (hasId(funcionariosList, id)){
                System.out.println("ID já foi utilizado, tente novamente.");
                System.out.print("ID: ");
                id = entrada.nextInt();
            }
            entrada.nextLine();
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Salário: ");
            Double salario = entrada.nextDouble();
            entrada.nextLine();

            Funcionarios emp = new Funcionarios(id,nome,salario);
            funcionariosList.add(emp);
        }

        System.out.print("Entre com o ID do funcionário que deseja aumentar o salário: ");
        int idSearch = entrada.nextInt();

        Funcionarios emp = funcionariosList.stream().filter(x -> x.getId() == idSearch).findFirst().orElse(null);

        if (emp != null){
            System.out.print("Diga qual a porcentagem de aumento do salário: ");
            Double percent = entrada.nextDouble();
            emp.aumento(percent);
        } else {
            System.out.println("O ID não existe");
        }

        System.out.println(" ");
        System.out.println("Lista de funcionários:");
        for (Funcionarios f : funcionariosList){
            System.out.println(f);
        }

    }

    public static boolean hasId(List<Funcionarios> list, int id) {
        Funcionarios emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
