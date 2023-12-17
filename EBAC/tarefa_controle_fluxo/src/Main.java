import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a primeira nota do aluno:");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota do aluno:");
        nota2 = entrada.nextDouble();
        System.out.println("Digite a terceira nota do aluno:");
        nota3 = entrada.nextDouble();
        System.out.println("Digite a quarta nota do aluno:");
        nota4 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("A nota final do aluno é " + media);
        if (media >= 7){
            System.out.println("Ele está aprovado!");
        } else if (media >= 5) {
            System.out.println(" Ele está de recuperação!");
        } else {
            System.out.println(" Ele está reprovado!");
        }
    }
}
