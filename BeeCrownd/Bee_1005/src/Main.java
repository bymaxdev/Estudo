import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double peso1 = 3.5, peso2 = 7.5;
        double media = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);

        System.out.printf("MEDIA = %.5f%n",media);
    }
}
