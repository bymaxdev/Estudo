public abstract class Pessoa {
    private String nome;
    private Long registro;

    public Pessoa(String nome, Long registro) {
        this.nome = nome;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getRegistro() {
        return registro;
    }

    public void setRegistro(Long registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\n" + "Registro: " + this.getRegistro() + "\n";
    }
}
