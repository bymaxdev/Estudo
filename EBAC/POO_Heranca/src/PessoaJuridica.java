public class PessoaJuridica extends Pessoa{
    private Integer numPessoas;

    public PessoaJuridica(String nome, Long registro, Integer numPessoas) {
        super(nome, registro);
        this.numPessoas = numPessoas;
    }

    public Integer getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(Integer numPessoas) {
        this.numPessoas = numPessoas;
    }

    @Override
    public String toString() {
        return "Pessoa Juridica: " + "\n" + super.toString() +
                "Numero de colaboradores: " + this.getNumPessoas();
    }
}
