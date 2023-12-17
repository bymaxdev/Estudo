import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double nota3 = entrada.nextDouble();
        double peso1 = 2, peso2 = 3, peso3 = 5;
        double media = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);

        System.out.printf("MEDIA = %.1f%n",media);
    }
}
