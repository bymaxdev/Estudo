public class Peixe extends Reptil{
    public Peixe(Integer idade, Integer membros, Double peso, String corEscama) {
        super(idade, membros, peso, corEscama);
    }

    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    @Override
    public void locomocao() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentacao() {
        System.out.println("Planctons");
    }

}
