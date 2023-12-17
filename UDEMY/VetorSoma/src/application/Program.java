package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int n;
        double soma = 0, media;

        System.out.print("Quantos números você quer digitar? ");
        n = entrada.nextInt();

        int[] vect = new int[n];

        for (int i=0; i< vect.length; i++){
            System.out.print("Digite o número: ");
            vect[i] = entrada.nextInt();
        }

        System.out.print("VALORES: ");
        for (int v : vect) {
            System.out.print(v + " ");
            soma += v;
        }
        System.out.println(" ");

        media = soma / vect.length;

        System.out.printf("SOMA = %.2f%n",soma);
        System.out.printf("MÉDIA = %.2f%n",media);

    }
}
