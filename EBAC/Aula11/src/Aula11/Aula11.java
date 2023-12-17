package Aula11;

public class Aula11 {
    public static void main(String[] args) {
        Visitante visitante = new Visitante("Max","M",25);
        Aluno aluno = new Aluno("Claudio","M",16,111,"Informática");
        Bolsista bolsista = new Bolsista("Carla", "F",18,222,"ADM",200);

        System.out.println(visitante.toString());
        System.out.println(aluno.toString());
        System.out.println(bolsista.toString());
        aluno.pagarMensalidade();
        bolsista.pagarMensalidade();
    }
}
