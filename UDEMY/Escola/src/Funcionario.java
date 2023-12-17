public class Funcionario extends Pessoa{
    // Atributos
    private String setor;
    private boolean trabalhando;

    // Métodos Públicos


    public Funcionario(String nome, String sexo, int idade, String setor) {
        super(nome, sexo, idade);
        this.setSetor(setor);
        this.setTrabalhando(true);
    }

    public void mudarTrabalho(){
        this.setTrabalhando(!this.isTrabalhando());
    }

    public void detalhes(){
        System.out.println("-------------FUNCIONARIO--------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Está trabalhando: " + this.isTrabalhando());
    }

    // Métodos Especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
