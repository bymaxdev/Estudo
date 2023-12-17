import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        long num;

        System.out.println("Digite um número:");
        num = entrada.nextLong();

        Long num1 = num;
        System.out.println("O número que você digitou foi: " + num1);
    }
}
