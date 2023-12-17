public abstract class Animais {
    protected Integer idade, membros;
    protected Double peso;

    public Animais(Integer idade, Integer membros, Double peso) {
        this.idade = idade;
        this.membros = membros;
        this.peso = peso;
    }

    public abstract void locomocao();
    public abstract void alimentacao();
    public abstract void somEmitido();

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getMembros() {
        return membros;
    }

    public void setMembros(Integer membros) {
        this.membros = membros;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "idade=" + idade +
                ", membros=" + membros +
                ", peso=" + peso;
    }
}
