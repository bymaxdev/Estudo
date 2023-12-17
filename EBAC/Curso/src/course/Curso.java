package course;

import java.util.Scanner;

public class Curso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n1 = entrada.nextInt();
        int total = n1;

        while (n1 != 0){
            System.out.println("Digite um numero:");
             n1 = entrada.nextInt();
             total += n1;
        }
        System.out.printf("O total de números digitados é: %d", total);
    }
}
