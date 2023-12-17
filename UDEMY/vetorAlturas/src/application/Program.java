package application;

import entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int nPessoas, count = 0;
        double somaAltura = 0, media;
        double mediaIdade;
        

        System.out.print("Número de pessoas que serão digitadas: ");
        nPessoas = entrada.nextInt();
        entrada.nextLine();

        Pessoas[] people = new Pessoas[nPessoas];


        for (int i=0; i < people.length; i++){
            System.out.println(" ");
            System.out.printf("Dados da pessoa %d:%n",i+1);
            System.out.print("Nome: ");
            String name = entrada.nextLine();
            System.out.print("Idade: ");
            int age = entrada.nextInt();
            System.out.print("Altura: ");
            double height = entrada.nextDouble();
            entrada.nextLine();

            people[i] = new Pessoas(name,age,height);

            somaAltura += height;

            if (age < 16){
                count++;
            }
        }

        media = somaAltura / people.length;
        mediaIdade = ((double) count / people.length) * 100;

        System.out.printf("A altura média informada é: %.2f%n",media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%",mediaIdade);
        System.out.println();

        for (Pessoas person : people) {
            if (person.getAge() < 16) {
                System.out.println(person.getName());
            }
        }
    }
}
