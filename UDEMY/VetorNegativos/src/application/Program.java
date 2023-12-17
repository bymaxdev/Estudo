package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.print("Quantos números deseja digitar: ");
        n = entrada.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i< vetor.length; i++){
            System.out.println("Digite um número: ");
            vetor[i] = entrada.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for (int v : vetor) {
            if (v <= 0) {
                System.out.println(v);
            }
        }
    }
}
