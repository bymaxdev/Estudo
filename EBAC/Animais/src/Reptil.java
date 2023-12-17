public class Reptil extends Animais {
    private String corEscama;

    public Reptil(Integer idade, Integer membros, Double peso, String corEscama) {
        super(idade, membros, peso);
        this.corEscama = corEscama;
    }

    @Override
    public void locomocao() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentacao() {
        System.out.println("Vegetais");
    }

    @Override
    public void somEmitido() {
        System.out.println("Som de reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
