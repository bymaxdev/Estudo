package Tarefa_colecoes2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();


        while (true){
            System.out.println("Digite nomes, para encerrar digite 'Sair':");
            String nome = entrada.next();

            if (nome.equalsIgnoreCase("sair")){
                break;
            } else {
                nomes.add(nome);
            }
        }
        Collections.sort(nomes);
        System.out.println("Segue abaixo os nomes digitados em ordem alfabetica:");
        System.out.println(nomes);
    }
}
