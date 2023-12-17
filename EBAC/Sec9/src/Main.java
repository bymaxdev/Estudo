import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Bank cliente;

        System.out.print("Número da conta: ");
        Long numConta = entrada.nextLong();
        System.out.print("Digite seu nome: ");
        entrada.nextLine();
        String nome = entrada.nextLine();
        System.out.print("Deseja fazer um deposito incial? (y/n): ");
        String iniDep = entrada.nextLine();


        if (iniDep.equalsIgnoreCase("y")){
            System.out.print("Digite o valor do depósito: ");
            Double valDep = entrada.nextDouble();
            cliente = new Bank(nome, numConta, valDep);
        } else {
            cliente = new Bank(nome,numConta);
        }

        System.out.println(cliente);

        int menu = 0;

        while (menu != 3 ){
            System.out.println("-------------------------------------------");
            System.out.println("1. Depósito | 2. Retirada | 3. sair");
            menu = entrada.nextInt();
            switch (menu){
                case 1:
                    System.out.print("Digite o valor de depósito: ");
                    Double valDep = entrada.nextDouble();
                    cliente.deposit(valDep);
                    System.out.println(cliente);
                    break;
                case 2:
                    System.out.println("Retiradas tem uma taxa de R$ 5,00");
                    System.out.print("Digite o valor de retirada: ");
                    Double valWit = entrada.nextDouble();
                    cliente.withdraw(valWit);
                    System.out.println(cliente);
                    break;
                case 3:
                    System.out.println("Saindo da Conta.");
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }

        }

        entrada.close();
    }
}
