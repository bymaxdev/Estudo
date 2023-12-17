import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        int nota1, nota2, nota3, nota4;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno:");
        nota1 = entrada.nextInt();
        System.out.println("Digite a segunda nota do aluno:");
        nota2 = entrada.nextInt();
        System.out.println("Digite a terceira nota do aluno:");
        nota3 = entrada.nextInt();
        System.out.println("Digite a quarta nota do aluno:");
        nota4 = entrada.nextInt();

        double media = (double) (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média desse aluno é: " + media);
    }

}
