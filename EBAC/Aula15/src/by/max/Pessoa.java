package by.max;

public abstract class Pessoa {
    protected String nome, sexo;
    protected Integer idade, experiencia;

    public Pessoa(String nome, String sexo, Integer idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = 0;
    }

    protected void ganharExp(){
        this.setExperiencia(getExperiencia()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Nome= " + nome + "\n" +
                "Sexo= " + sexo + "\n" +
                "Idade= " + idade + "\n" +
                "Experiencia= " + experiencia + "\n";
    }
}
