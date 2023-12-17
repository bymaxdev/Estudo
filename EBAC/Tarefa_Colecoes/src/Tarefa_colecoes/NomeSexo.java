package Tarefa_colecoes;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NomeSexo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        String nomeSexo;

        while (true) {
            System.out.println("Digite o Nome e Sexo (M/F, separados por '-')");
            nomeSexo = entrada.next();

            if (nomeSexo.equalsIgnoreCase("sair")) {
                break;
            } else {
                String[] parte = nomeSexo.split("-");
                String nome = parte[0];
                String sexo = parte[1];

                if (sexo.equalsIgnoreCase("M")){
                    nomesMasculinos.add(nome);
                } else if (sexo.equalsIgnoreCase("F")) {
                    nomesFemininos.add(nome);
                }

            }

        }


        Collections.sort(nomesMasculinos);
        Collections.sort(nomesFemininos);

        System.out.println("Lista de nomes masculinos em ordem alfabetica:");
        System.out.println(nomesMasculinos);
        System.out.println(" ");
        System.out.println("Lista de nomes femininos em ordem alfabetica:");
        System.out.println(nomesFemininos);


    }
}
