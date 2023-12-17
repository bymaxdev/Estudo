public class PessoaFisica extends Pessoa{
    private Integer idade;
    private String sexo;

    public PessoaFisica(String nome, Long registro, Integer idade, String sexo) {
        super(nome, registro);
        this.idade = idade;
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa Fisica: " + "\n" +
                super.toString() +
                "Idade: " + this.getIdade() + "\n" +
                "Sexo: " + this.getSexo();
    }
}
