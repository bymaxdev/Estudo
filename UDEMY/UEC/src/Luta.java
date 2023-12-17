import java.util.Random;

public class Luta {
    private Lutadores desafiado;
    private Lutadores desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos

    public Luta() {
        this.setRounds(5);
        this.setAprovada(false);
    }

    public void marcarLuta(Lutadores lutador1, Lutadores lutador2){
        //this.setAprovada(lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2);

        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2){
            this.setAprovada(true);
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
        } else {
            this.setAprovada(false);
        }

    }

    public void lutar(){
        Random random = new Random();

        if (this.isAprovada()){
            this.getDesafiante().apresentar();
            this.getDesafiado().apresentar();

            int vencedor = random.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("Empate!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println(this.getDesafiado().getNome() + " ganhou a luta!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println(this.getDesafiante().getNome() + " ganhou a luta!");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
                default:
                    System.out.println("A luta teve que ser interrompida.");
                    break;
            }
        } else {
            System.out.println("A Luta não pode acontecer");
        }
    }

    //Métodos especiais

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
