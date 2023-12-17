import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String name = entrada.nextLine();
        System.out.print("Digite o salário: ");
        double grossSalary = entrada.nextDouble();
        System.out.print("Digite o imposto: ");
        double tax = entrada.nextDouble();

        System.out.println(" ");

        Empregado e1 = new Empregado(name,grossSalary,tax);
        System.out.println(e1);

        System.out.println(" ");

        System.out.print("Quantos porcento gostaria de aumentar o salário? ");
        double percent = entrada.nextDouble();
        e1.increaseSalary(percent);

        System.out.println("Update - " + e1);


    }
}
