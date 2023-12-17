package Aula11;

public class Tecnico extends Aluno{
    private long registroProfissional;

    public Tecnico(String nome, String sexo, int idade, int matricula, String curso, long registroProfissional) {
        super(nome, sexo, idade, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    public void praticar(){
        System.out.println("Aluno técnico " +this.getNome()+ " está praticando.");
    }

    public long getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(long registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return super.toString() + " | Registro: " + this.getRegistroProfissional();
    }
}
