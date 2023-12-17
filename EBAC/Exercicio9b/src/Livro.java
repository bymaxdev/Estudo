public class Livro implements Publicacao{
    // Atributos
    private String titulo;
    private int totPaginas, pagAtual;
    private Pessoa autor, leitor;
    private boolean aberto;

    //Métodos Públicos

    public Livro(String titulo, int totPaginas,Pessoa autor, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setTotPaginas(totPaginas);
        this.setPagAtual(0);
        this.setAutor(autor);
        this.setLeitor(leitor);
        this.setAberto(false);
    }

    public void detalhes(){
        if (this.isAberto()){
            System.out.println("-----------------------------");
            System.out.println("Titulo: " + this.getTitulo());
            System.out.println("Autor: " + this.getAutor().getNome());
            System.out.println("Total de páginas: " + this.getTotPaginas());
            System.out.println("Página atual: " + this.getPagAtual());
            System.out.println("Leitor: " + this.getLeitor().getNome());
            System.out.println("Idade do leitor: " + this.getLeitor().getIdade());
            System.out.println("Sexo do leitor: " + this.getLeitor().getSexo());
        } else {
            System.out.println("Abra o livro para ver os detalhes.");
        }
    }

    @Override
    public void abrir() {
        if (!(this.isAberto())){
            this.setAberto(true);
            this.setPagAtual(1);
        }else {
            System.out.println("O livro já está aberto.");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()){
            this.setAberto(false);
        }
    }

    @Override
    public void folhear(int pag) {
        if (this.getTotPaginas() >= pag) {
            this.setPagAtual(pag);
        } else {
            System.out.println("O livro possui apenas " + this.getTotPaginas() + " páginas.");
        }
    }

    @Override
    public void avancarPag() {
        if (this.isAberto() && this.getPagAtual() < this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            System.out.println("O livro acabou!");
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto() && this.getPagAtual() > 1){
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            System.out.println("Não foi possivel voltar uma página.");
        }
    }

    // Metodos Especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
