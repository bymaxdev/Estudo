package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        int[][] matriz = new int[n][n];

        for (int i=0; i < matriz.length; i++){
            for (int j=0; j< matriz[i].length; j++){
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Números na diagonal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        int count = 0;

        System.out.println(" ");
        System.out.println("Números negativos:");
        for (int i = 0; i < matriz.length; i++){
            for (int j=0; j< matriz[i].length; j++){
                if (matriz[i][j] < 0){
                    System.out.print(matriz[i][j] + " ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Quantidade de numeros negativos:" + count);

    }
}
