package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos quartos gostaria de alugar? ");
        int nAlugueis = entrada.nextInt();
        entrada.nextLine();

        Pessoa[] locatario = new Pessoa[10];


        for (int i=0; i < nAlugueis; i++){
            System.out.println(" ");
            System.out.printf("Locação #%d%n",i+1);
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Email: ");
            String email = entrada.nextLine();
            System.out.print("Quarto: ");
            int quarto = entrada.nextInt();
            entrada.nextLine();

            locatario[quarto] = new Pessoa(nome, email);
        }

        System.out.println(" ");
        System.out.println("-Quartos alugados-");
        for (int i = 0; i < locatario.length; i++) {
            if (locatario[i] != null){
                System.out.println(i + ": " + locatario[i]);
            }

        }

    }
}
