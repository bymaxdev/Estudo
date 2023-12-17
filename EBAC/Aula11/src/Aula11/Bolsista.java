package Aula11;

public class Bolsista extends Aluno{
    private double bolsa;

    public Bolsista(String nome, String sexo, int idade, int matricula, String curso, double bolsa) {
        super(nome, sexo, idade, matricula, curso);
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno: " + this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Desconto na mensalidade para bolsista: " + this.getNome());
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return super.toString() + " | bolsa: " + bolsa;
    }
}
