public class Zoologico {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero(2,4,25.2,"Preto");
        Reptil reptil = new Reptil(4,4,2.2,"Verde");
        Peixe peixe = new Peixe(1,3,0.3,"Azul");
        Ave ave = new Ave(5,4,0.1,"Preto e Verde");

        System.out.println(mamifero.toString());
        mamifero.alimentacao();
        mamifero.somEmitido();
        mamifero.locomocao();

        peixe.somEmitido();



    }
}
