public class Main {
    public static void main(String[] args) {
        PessoaJuridica PJ = new PessoaJuridica("Bymax SA", 154234876L,45);
        System.out.println(PJ);

        System.out.println(" ");

        PessoaFisica PF = new PessoaFisica("Max Reis",1514632489L,25,"Masculino");
        System.out.println(PF);
    }
}
