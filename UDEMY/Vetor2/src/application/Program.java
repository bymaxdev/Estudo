package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        double soma = 0, media;

        Product[] vect = new Product[n];

        for (int i=0; i< vect.length; i++){
            entrada.nextLine();
            String name = entrada.nextLine();
            double price = entrada.nextDouble();

            vect[i] = new Product(name, price);
        }

        for (Product product : vect) {
            soma += product.getPrice();
        }

        media = soma / vect.length;

        System.out.printf("A média dos preços é: %.2f",media);

    }
}
