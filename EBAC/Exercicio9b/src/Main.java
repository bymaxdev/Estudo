public class Main {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[4];

        p[0] = new Pessoa("Max","Masc",25);
        p[1] = new Pessoa("João","Masc",43);
        p[2] = new Pessoa("Jessica", "Fem",15);
        p[3] = new Pessoa("Vanessa","Fem",25);

        Livro l1 = new Livro("Maçãs caidas",185,p[2],p[3]);
        l1.abrir();
        l1.folhear(186);
        l1.avancarPag();


        l1.detalhes();
    }
}
