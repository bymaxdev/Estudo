package by.max;

public class ProjetoFinal {
    public static void main(String[] args) {
        Video videos[] = new Video[3];
        videos[0] = new Video("Programação");
        videos[1] = new Video("Estrutura de dados");
        videos[2] = new Video("POO");

        Gafanhoto gafanhoto[] = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("Max","Masc",25,"Bymax");
        gafanhoto[1] = new Gafanhoto("Jubileu","Masc",22,"Jubilovsk");

//        System.out.println(videos[0].toString());
//        System.out.println(gafanhoto[0].toString());
        Visualizacao vis = new Visualizacao(gafanhoto[0], videos[1]);
        System.out.println(vis.toString());

    }
}
