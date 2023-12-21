package application;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities_enum.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Diga o nome do departamento: ");
        String departamentName = entrada.nextLine();
        System.out.println("Entre com os dados do funcionário:");
        System.out.print("Nome: ");
        String name = entrada.nextLine();
        System.out.println("Defina o level do funcionário digitando o número correspondente:");
        System.out.print("Opções: 1. Junior, 2.Pleno, 3.Sênior: ");
        int option = entrada.nextInt();
        WorkLevel level = null;
        switch (option){
            case 1:
                level = WorkLevel.JUNIOR;
                break;
            case 2:
                level = WorkLevel.MID_LEVEL;
                break;
            case 3:
                level = WorkLevel.SENIOR;
                break;
            default:
                System.out.println("Opção inválida");
                System.exit(0);
        }
        System.out.print("Salário base: ");
        double salario = entrada.nextDouble();

        Worker func = new Worker(name,level,salario,new Departament(departamentName));

        System.out.println();
        System.out.print("Informe o número de contratos do funcionário: ");
        int nContratos = entrada.nextInt();

        for (int i = 0; i < nContratos ; i++) {
            System.out.printf("Informe o contrato #%d:%n",i+1);
            System.out.print("Date (DD/MM/YYYY): ");
            Date cData = sdf.parse(entrada.next());
            System.out.print("Valor da hora: ");
            double hourVal = entrada.nextDouble();
            System.out.print("Horas trabalhadas: ");
            int horas = entrada.nextInt();

            HourContract contract = new HourContract(cData, hourVal, horas);
            func.addContract(contract);
            System.out.println("Contrato adicionado: Data: " + cData + ", Valor Total: " + contract.totalValue());
        }

        System.out.println("Contratos do funcionário:");
        for (HourContract c : func.getContracts()) {
            System.out.println("Data: " + c.getData() + ", Valor Total: " + c.totalValue());
        }

        System.out.println();
        System.out.print("Entre com mês e ano para calcular o salário (MM/YYYY): ");
        String monthAndYear = entrada.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome: " + func.getName());
        System.out.println("Departamento: " + func.getDepartament().getName());
        System.out.println("No mês/ano " + monthAndYear + ": " + func.income(month, year));
    }
}
