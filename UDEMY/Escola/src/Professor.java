public class Professor extends Pessoa{
    // Atributos
    private String especialidade;
    private double salario;

    // Métodos Públicos


    public Professor(String nome, String sexo, int idade, String especialidade, double salario) {
        super(nome, sexo, idade);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }

    public void receberAum(double valor){
        this.setSalario(this.getSalario() + valor);
    }

    public void detalhes(){
        System.out.println("-------------PROFESSOR--------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Epecialidade: " + this.getEspecialidade());
        System.out.println("Salário: R$" + this.getSalario());
    }

    // Métodos Especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
