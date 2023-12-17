import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int a = entrada.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = entrada.nextInt();

        int x = a + b;

        System.out.println("X = " + x);

        entrada.close();
    }
}
