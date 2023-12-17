public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maicon","M",22,"Matemática");
        Funcionario func = new Funcionario("Carla", "F",25,"Diretoria");
        Professor prof = new Professor("Max","M",25,"Desenvolvimento",15000);

        aluno.fazerAniv();
        aluno.detalhes();
        aluno.cancelarMatricula();
        aluno.detalhes();

        func.mudarTrabalho("Assistente");
        func.detalhes();

        prof.receberAum(2500);
        prof.detalhes();


    }
}
