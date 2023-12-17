public class Mamifero extends Animais{
    private String corPelo;

    public Mamifero(Integer idade, Integer membros, Double peso, String corPelo) {
        super(idade, membros, peso);
        this.setCorPelo(corPelo);
    }

    @Override
    public void locomocao() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentacao() {
        System.out.println("Leite");
    }

    @Override
    public void somEmitido() {
        System.out.println("Som de mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
        return "Mamifero " +
                "corPelo='" + corPelo + '\'' +
                "} " + super.toString();
    }
}
