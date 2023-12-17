import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double raio = entrada.nextDouble();

        double area = 3.14159 * Math.pow(raio,2);

        System.out.printf("A=%.4f%n",area);
    }
}
