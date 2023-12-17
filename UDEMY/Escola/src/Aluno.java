public class Aluno extends Pessoa{
    // Atributos
    private boolean matricula;
    private String curso;

    // Métodos Públicos


    public Aluno(String nome, String sexo, int idade, String curso) {
        super( nome,sexo, idade);
        this.setCurso(curso);
        this.setMatricula(true);
    }

    public void cancelarMatricula(){
        this.setMatricula(false);
    }

    public void detalhes(){
        System.out.println("-------------ALUNO--------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("A matricula está ativa: " + this.isMatricula());
    }

    // Métodos Especiais


    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
