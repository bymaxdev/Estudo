public class Main {
    public static void main(String[] args) {
        Lutadores lutador[] = new Lutadores[6];

        lutador[0] = new Lutadores("Pretty Boy", "França",31, 1.75,68.9, 11,3,1);
        lutador[1] = new Lutadores("Putscript", "Brasil", 29, 1.68,57.8,14, 2, 3);
        lutador[2] = new Lutadores("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        lutador[3] = new Lutadores("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        lutador[4] = new Lutadores("Ufocobol", "Brasil", 37, 1.70, 119.3, 5,4,3);
        lutador[5] = new Lutadores("Nerdaard","EUA",30,1.81,105.7,12,2,4);

        Luta UEC = new Luta();
        UEC.marcarLuta(lutador[4], lutador[5]);
        UEC.lutar();

    }
}
