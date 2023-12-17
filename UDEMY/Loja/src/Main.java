import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = entrada.next();
        System.out.println("Digite o preço do produto:");
        double price = entrada.nextDouble();
        System.out.println("Digite a quantidade:");
        int quantity = entrada.nextInt();

        Product produto = new Product(nome, price, quantity);

        System.out.println(produto);

        System.out.println("Digite o numero de produtos que deseja adicionar:");
        quantity = entrada.nextInt();
        produto.addProducts(quantity);
        System.out.println(produto);

        System.out.println("Digite o numero de produtos que deseja retirar:");
        quantity = entrada.nextInt();
        produto.removeProducts(quantity);
        System.out.println(produto);

    }
}
