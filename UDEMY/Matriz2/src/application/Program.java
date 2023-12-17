package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int nLinhas = entrada.nextInt();
        System.out.print("Digite o número de colunas: ");
        int nColunas = entrada.nextInt();

        int[][] matriz = new int[nLinhas][nColunas];

        System.out.println(" ");

        for (int i = 0; i < matriz.length; i++){
            System.out.printf("Digite os números da linha %d: %n",i);
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = entrada.nextInt();
            }
        }
        entrada.nextLine();
        System.out.print("Digite o número que deseja buscar na matriz: ");
        int search = entrada.nextInt();

        System.out.println(" ");
        System.out.println("Dada a seguinte matriz:");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == search){
                    System.out.println("O número " + search + " foi encontrado na posição " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }

        }


    }

}
