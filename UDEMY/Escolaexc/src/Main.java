import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("O valor do dolar atual é: " + CurrencyConverter.DOL);
        System.out.println("Quantos dolares deseja comprar?");
        double buy = entrada.nextDouble();
        CurrencyConverter.howMuch(buy);
        System.out.println();
    }
}
