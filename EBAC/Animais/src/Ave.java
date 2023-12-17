public class Ave extends Animais{
    private String corPena;

    public Ave(Integer idade, Integer membros, Double peso, String corPena) {
        super(idade, membros, peso);
        this.corPena = corPena;
    }

    public void fazerNinho(){
        System.out.println("Fazendo um ninho");
    }

    @Override
    public void locomocao() {
        System.out.println("Voando");
    }

    @Override
    public void alimentacao() {
        System.out.println("Frutas");
    }

    @Override
    public void somEmitido() {
        System.out.println("Som de ave");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
