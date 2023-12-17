public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(111);
        c1.setDono("Jubileu");
        c1.abrirConta("CC");
        c1.depositar(300);

        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(222);
        c2.setDono("Creusa");
        c2.abrirConta("CP");
        c2.depositar(500);

        c2.estadoAtual();
        c1.estadoAtual();


    }
}
